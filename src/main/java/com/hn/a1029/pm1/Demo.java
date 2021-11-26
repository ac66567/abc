package com.hn.a1029.pm1;

import java.util.Random;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        // 第一步 先去创建对象 键盘输入对象
//        Scanner sc = new Scanner(System.in);
//        // 第二步你想干什么 让他输入int值
//        int i = sc.nextInt();
//        System.out.println(i);

        // Random 随机数
        //创建对象
        Random r = new Random();
        // 返回随机数
        int i1 = r.nextInt();  // int 范围内所有值
        System.out.println(i1);
        // 0 - 9
        int i = r.nextInt(10);
        System.out.println(i);

        // 1- 10     0-9
        int i2 = r.nextInt(10) + 1;
        System.out.println(i2);

        int i3 = new Random().nextInt(10);
        System.out.println(i3);

        System.out.println(new Random().nextInt(10));
    }


}
