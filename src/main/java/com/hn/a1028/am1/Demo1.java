package com.hn.a1028.am1;

public class Demo1 {

    public static void main(String[] args) {

//        show(10);
//
//        show(1, 1, 1, 1);

//        int[] arr = {1, 11, 2, 3};
//        show(arr);
        System.out.println("----------");


//        show(1,324,324,21,5342,65);

    }

//    public static void show(int a) {
//        System.out.println(a);
//    }
//
//    public static void show(String s ,int a, int b, int c, String s1 , int d) {
//
//    }

//    public static void show(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }

     //可变参数
    public static void show(String s,char c,int... arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
