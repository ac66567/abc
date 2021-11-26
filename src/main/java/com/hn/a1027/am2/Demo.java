package com.hn.a1027.am2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) throws Exception {
        Demo d = new Demo();
        d.new ReceiveDemo().start();
        d.new SenderDemo().start();

    }

    class SenderDemo extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    DatagramSocket socket = new DatagramSocket();

                    Scanner sc = new Scanner(System.in);
                    System.out.println("请输入..");
                    String str = sc.nextLine();
                    if (str.equals("quit")) {
                        break;
                    } else {
                        byte[] bytes = str.getBytes();
                        DatagramPacket packet = new DatagramPacket(bytes, bytes.length,
                                InetAddress.getByName("127.0.0.1"), 6666);
                        socket.send(packet);
                    }

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class ReceiveDemo extends Thread {
        @Override
        public void run() {
            try {
                DatagramSocket socket = new DatagramSocket(6666);
                DatagramPacket packet = new DatagramPacket(new byte[20], 20);
                while (true) {
                    socket.receive(packet);
                    byte[] data = packet.getData();
                    System.out.println(new String(data, 0, data.length));
                    System.out.println(packet.getAddress().getHostAddress()
                            + "\t" + packet.getPort() + "\t" + packet.getLength());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
