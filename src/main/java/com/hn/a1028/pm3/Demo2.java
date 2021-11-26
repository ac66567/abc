package com.hn.a1028.pm3;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        String str = new Scanner(System.in).next();
//        String next = sc.next();

        // 匿名对象 你只需要调用一次方法
//        new Scanner(System.in).next();
//        new Scanner(System.in).next();

        Scanner sc = new Scanner(System.in);

        show(sc);
        // 匿名对象当做参数传递
        show(new Scanner(System.in));
    }

    public static Scanner play() {
//        Scanner sc = new Scanner(System.in);
//        return sc;
        // 匿名对象 当做返回值
        return new Scanner(System.in);
    }

    public static void show(Scanner sc) {

    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
