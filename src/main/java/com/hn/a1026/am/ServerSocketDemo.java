package com.hn.a1026.am;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo {

    public static void main(String[] args) throws Exception  {

        ServerSocket serverSocket = new ServerSocket(6666);
        System.out.println("等待客户端连接....");
        Socket accept = serverSocket.accept();
        System.out.println("客户端连接成功");

        InputStream in = accept.getInputStream();
        byte[] bytes = new byte[100];
        int len = in.read(bytes);
        System.out.println(new String(bytes, 0, len));

        Thread.sleep(3000l);

        System.out.println("向客户端回写数据");
        OutputStream out = accept.getOutputStream();
        out.write("好的,下一步工作,去北京出差..".getBytes());

        accept.shutdownOutput();

    }
}
