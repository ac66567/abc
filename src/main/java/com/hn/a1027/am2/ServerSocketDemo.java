package com.hn.a1027.am2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo {

    public static void main(String[] args) throws Exception {

        ServerSocket server = new ServerSocket(9999);
        System.out.println("等待客户端连接");
        Socket socket = server.accept();

        InputStream in = socket.getInputStream();
        int len;
        while ((len = in.read()) != -1) {
            System.out.print((char) len);
        }
        // 不能 , close()  socket 一起关闭
//        in.close();

        System.out.println("接收成功, 开始回写数据");
        OutputStream out = socket.getOutputStream();
        out.write("This is the server. I have received your data".getBytes());
        socket.shutdownOutput();

//        out.close();in.close();
        socket.close();


    }
}
