package com.hn.a1027.am2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
    public static void main(String[] args) throws Exception {

        DatagramSocket datagramSocket = new DatagramSocket();
        DatagramPacket datagramPacket = new DatagramPacket("hello world".getBytes(),
                11, InetAddress.getByName("127.0.0.1"), 9999);

        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
