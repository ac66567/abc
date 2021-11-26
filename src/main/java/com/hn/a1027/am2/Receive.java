package com.hn.a1027.am2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive {

    public static void main(String[] args) throws Exception {

        DatagramSocket datagramSocket = new DatagramSocket(9999);
        DatagramPacket datagramPacket = new DatagramPacket(new byte[20], 20);

        datagramSocket.receive(datagramPacket);
        byte[] data = datagramPacket.getData();
        System.out.println(new String(data, 0, data.length));
        System.out.println(datagramPacket.getAddress().getHostAddress());
        System.out.println(datagramPacket.getPort());
        System.out.println(datagramPacket.getLength());

    }
}
