package com.hn.a1027.am2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketDemo {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 9999);
        System.out.println("开始向服务器写数据");
        Thread.sleep(2000);
        OutputStream out = socket.getOutputStream();
        out.write("I'm a client object".getBytes());
        socket.shutdownOutput();

        System.out.println("向服务器写出数据成功");

        InputStream in = socket.getInputStream();
        int len;
        while ((len = in.read()) != -1) {
            System.out.print((char) len);
        }

        socket.close();

    }
}
