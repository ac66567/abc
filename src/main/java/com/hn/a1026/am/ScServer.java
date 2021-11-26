package com.hn.a1026.am;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ScServer {

    public static void main(String[] args) throws Exception {

        ServerSocket server = new ServerSocket(8888);
        System.out.println("等待客户端连接");
        Socket socket = server.accept();
        InputStream in = socket.getInputStream();
        BufferedOutputStream buffOUT = new BufferedOutputStream(new FileOutputStream("D://b.log"));

        int len;
        byte[] bytes = new byte[1024];
        while ((len = in.read(bytes)) != -1) {
            buffOUT.write(bytes, 0, len);
            buffOUT.flush();
        }
        buffOUT.close();

        OutputStream out = socket.getOutputStream();
        out.write("上传文件成功".getBytes());
        socket.close();


    }
}
