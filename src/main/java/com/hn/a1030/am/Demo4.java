package com.hn.a1030.am;

import java.io.FileNotFoundException;

public class Demo4 {


    public static void main(String[] args) {

        try {
            System.out.println("hello world1");
            System.out.println("hello world2");
            System.out.println("hello world3");
            System.out.println("hello world4");


            show("b.txt");

            System.out.println("world1");
            System.out.println("world2");
            System.out.println("world2");
            System.out.println("world3");

        } catch (FileNotFoundException e) {
            System.exit(0);
            System.out.println("hello 1");
            System.out.println("hello 2");
            System.out.println("hello 3");
            System.out.println("hello 4");

            e.printStackTrace();
        } finally {
            System.out.println("关闭文件");
            System.out.println("不管你是否出现异常,我都会执行");
        }

        System.out.println("程序继续执行");
        System.out.println("程序继续执行");
        System.out.println("程序继续执行");
    }

    public static void show(String fileName) throws FileNotFoundException {
        if (!fileName.equals("a.txt")) {
            throw new FileNotFoundException("文件没有找到");
        } else {
            System.out.println("文件找到");
        }


    }
}
