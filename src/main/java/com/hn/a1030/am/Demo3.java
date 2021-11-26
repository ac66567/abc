package com.hn.a1030.am;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Demo3 {

    public static void main(String[] args) throws FileNotFoundException {

        show("b.txt");

        System.out.println("程序继续执行");
        System.out.println("程序继续执行");
        System.out.println("程序继续执行");
    }

    // throws 用于方法声明之上, 声明异常
    public static void show(String fileName) /*throws  FileNotFoundException*/{
        if (!fileName.equals("a.txt")) {
            // 编译时异常  throw 方法中, 抛出异常
            // 0 程序正常执行结束   1非正常执行结束    -1 手动终止
//            throw new FileNotFoundException();
            try {
                throw new FileNotFoundException("文件没有找到");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
            }
        } else {
            System.out.println("文件找到");
        }

    }
}
