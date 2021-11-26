package com.hn.a1028.pm3;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        // 创建文本扫描器对象 键盘输入对象
        Scanner sc = new Scanner(System.in);

//        //通过键盘输入两个整数并求和
//        System.out.println("请你先输入一个整数");
//        int one = sc.nextInt();
//        System.out.println("请你在输入一个整数");
//        int two = sc.nextInt();
//        System.out.println("你输入的两个数的和是: ");
//        System.out.println(one + two);

        System.out.println("请你先输入一个整数");
        int one = sc.nextInt();
        System.out.println("请你在输入一个整数");
        int two = sc.nextInt();
        System.out.println("请你在输入一个整数");
        int three = sc.nextInt();
//
//        System.out.println("你输入三个数的最大值是: ");
//
////        int max = one > two ? one : two;
////        int max1 = max > three ? max : three;
//
//        int max1 = one > two ? one > three ? one : three : two > three ? two : three;
//        System.out.println(max1);

        System.out.println("请输入.");
//        String str = sc.next();
//        System.out.println(str);

        String s = sc.nextLine();
        System.out.println(s);

    }
}
