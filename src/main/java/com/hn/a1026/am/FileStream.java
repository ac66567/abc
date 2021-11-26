package com.hn.a1026.am;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileStream {


}

class FileStreamSocket {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 9999);
        BufferedInputStream buffIn = new BufferedInputStream(new FileInputStream("F://l.log"));
        OutputStream out = socket.getOutputStream();
        int len;
        byte[] bytes = new byte[1024];
        while ((len = buffIn.read(bytes)) != -1) {
            out.write(bytes, 0, len);
            out.flush();
        }
        socket.shutdownOutput();


        System.out.println("---------------------");
        InputStream in = socket.getInputStream();
        int len1 = in.read(bytes);
        System.out.println(new String(bytes, 0, len1));

        socket.shutdownInput();
        out.close();
        buffIn.close();
        socket.close();
    }

}

class FileStreamServerSocket {

    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(9999);
        System.out.println("等到客户端连接");
        Socket socket = server.accept();
        System.out.println("客户端连接成功");

        InputStream in = socket.getInputStream();
        BufferedOutputStream buffOut = new BufferedOutputStream(new FileOutputStream("E://a.log"));
        int len;
        byte[] bytes = new byte[1024];
        while ((len = in.read(bytes)) != -1) {
            buffOut.write(bytes, 0, len);
            buffOut.flush();
        }

        socket.shutdownInput();

        System.out.println("客户端 上传成功, 回写数据");
        OutputStream out = socket.getOutputStream();
        out.write("恭喜你上传成功".getBytes());


        socket.shutdownOutput();
        buffOut.close();
        in.close();
        socket.close();
    }
}