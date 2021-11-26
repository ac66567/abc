package com.hn.a1029.pm1;

import java.util.Random;
import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {

        // 第一步
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入");
        // 第二步做什么
//        double i = sc.nextDouble();
//        System.out.println(i);

//        String next = sc.next();
//        System.out.println(next);

//        String s = sc.nextLine();
//        System.out.println(s);

        //匿名对象 匿名 不知道名字 没有名字的对象
        // 由sc1 保存 Scanner对象地址值

        // 不保存地址 是匿名对象
//        int i = new Scanner(System.in).nextInt();
//        System.out.println(i);
//        int i2 = new Scanner(System.in).nextInt();
//        int i3 = new Scanner(System.in).nextInt();
//        int i4 = new Scanner(System.in).nextInt();

//        Scanner sc1 = new Scanner(System.in);
//        int i5 = sc1.nextInt();
//        int i6 = sc1.nextInt();

        // 随机数对象 Random
        Random r = new Random();
        // 返回随机数
        int i = r.nextInt();
        System.out.println(i);

        int i1 = r.nextInt();
        System.out.println(i1);

        // 0-9
        int i2 = r.nextInt(10);
        System.out.println(i2);

        // 1-10   0-9
        int i3 = r.nextInt(10) + 1;
        System.out.println(i3);


        Scanner scanner = new Scanner(System.in);
        show(scanner);

        // 匿名对象当做参数传递
        show(new Scanner(System.in));
    }

    public static void show(Scanner sc) {

    }

    public static Scanner play() {
        // 返回值是匿名对象
        return new Scanner(System.in);
    }
}
