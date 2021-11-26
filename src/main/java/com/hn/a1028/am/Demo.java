package com.hn.a1028.am;

import java.net.*;
import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        Demo demo = new Demo();
        SendDemo sendDemo = demo.new SendDemo();
        Receive receive = demo.new Receive();

        sendDemo.start();
        receive.start();

    }

    class SendDemo extends Thread {
        @Override
        public void run() {
            try {
                DatagramSocket socket = new DatagramSocket();
                byte[] bytes = new byte[60];

                bytes = "hello world  wo shi client".getBytes();
                DatagramPacket packet = new DatagramPacket(
                        bytes, 0, bytes.length, InetAddress.getByName("localhost"), 9999);
                socket.send(packet);
                System.out.println("发送成功");

            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }

    class Receive extends Thread {
        @Override
        public void run() {
            try {
                DatagramSocket socket = new DatagramSocket(9999);
                byte[] bytes = new byte[60];
                DatagramPacket packet = new DatagramPacket(bytes, 5, bytes.length-5);

                socket.receive(packet);

                byte[] data = packet.getData();
                for (byte b : data){
                    System.out.print((char) b);
                }
                System.out.println();

                System.out.println(Arrays.toString(data));

                System.out.println(packet.getLength());
                System.out.println(packet.getAddress().getHostAddress());
                System.out.println(packet.getPort());
                System.out.println(packet.getOffset());

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

}
