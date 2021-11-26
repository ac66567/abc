package com.hn.a1027.am1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo {

    public static void main(String[] args) throws Exception {

        ServerSocket server = new ServerSocket(6666);
        while (true) {
            System.out.println("等待客户端连接....");
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream in = socket.getInputStream();
                        String s = "E://" + System.currentTimeMillis() + ".data";
                        BufferedOutputStream buffOut = new BufferedOutputStream(new FileOutputStream(s));
                        int len;
                        byte[] bytes = new byte[1024];
                        while ((len = in.read(bytes)) != -1) {
                            buffOut.write(bytes, 0, len);
                            buffOut.flush();
                        }
                        buffOut.close();
                        System.out.println("保存成功");
                        OutputStream out = socket.getOutputStream();
                        out.write("hello shang chuan cheng gong".getBytes());
                        socket.shutdownOutput();
                        socket.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
