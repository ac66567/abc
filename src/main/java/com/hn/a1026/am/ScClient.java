package com.hn.a1026.am;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ScClient {

    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("localhost", 8888);

        BufferedInputStream buffIN = new BufferedInputStream(new FileInputStream("F://l.log"));
        OutputStream out = socket.getOutputStream();

        int len;
        byte[] bytes = new byte[1024];
        while ((len = buffIN.read(bytes)) != -1) {
            out.write(bytes, 0, len);
            out.flush();
        }
        socket.shutdownOutput();
        System.out.println("我要上传数据");

        InputStream in = socket.getInputStream();
        int read = in.read(bytes);
        System.out.println(new String(bytes, 0, read));

        socket.close();

    }
}
