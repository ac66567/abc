package com.hn.a1029.pm;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 9;
        System.out.println(b);
        b = show(a);
        System.out.println(a);
        System.out.println(b);
    }

    public static int show(int a) {
        System.out.println("请输入一个数值...");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int ai = a + i;
        System.out.println(ai);
        return ai;
    }
}