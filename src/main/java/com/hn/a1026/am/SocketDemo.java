package com.hn.a1026.am;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketDemo {

    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("127.0.0.1", 6666);

        OutputStream out = socket.getOutputStream();
        out.write("你好我是客户端".getBytes());
        System.out.println("向服务器写数据....,等待回写");

        InputStream in = socket.getInputStream();
        byte[] bytes = new byte[100];
        int len = in.read(bytes);
        System.out.println(new String(bytes, 0, len));

    }
}
