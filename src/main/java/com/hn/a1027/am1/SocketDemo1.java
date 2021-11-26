package com.hn.a1027.am1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketDemo1 {

    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("localhost", 6666);

        BufferedInputStream buffIn = new BufferedInputStream(new FileInputStream("F://log02.data"));
        OutputStream out = socket.getOutputStream();
        byte[] bytes = new byte[1024];
        int len;
        while ((len = buffIn.read(bytes)) != -1) {
            out.write(bytes, 0, len);
            out.flush();
        }
        Thread.sleep(5000l);
        // close 会把 socket 对象一起关闭
        //  out.close();
        // 禁用此输出流
        socket.shutdownOutput();
        buffIn.close();
        System.out.println("上传成功");

        InputStream in = socket.getInputStream();
        int len1;
        while ((len1 = in.read()) != -1) {
            System.out.print((char)(byte)len1);
        }

        socket.close();

    }
}
