package com.hn.a1026.pm;

public class Demo1 {

    public static void main(String[] args) {

//        int a = 10;
//        show(10);
//
//        System.out.println(a); // 10

        int[] a = {1, 2, 3, 4};
        show(a);

        System.out.println(a[0]); // 1  100

    }

    public static void show(int[] a) {
        System.out.println(a[0]);  // 1
        a[0] = 100;
        System.out.println(a[0]);  // 100
    }

//    public static void show(int bc) {
//        System.out.println(bc); //  10
//        bc = 100;
//        System.out.println(bc); // 100
//    }
}
