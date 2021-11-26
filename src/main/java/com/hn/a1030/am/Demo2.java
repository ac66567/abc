package com.hn.a1030.am;

import java.util.Objects;

public class Demo2 {

    public static void main(String[] args) {

//        int[] arr = {11, 22, 33, 44};
//        show(arr, 3);
//
//        System.out.println("程序继续执行");

        String s = null;
        String s1 = "hello";
//        boolean equals = s.equals(s1);
//        System.out.println(equals);
        boolean equals1 = Objects.equals(s, s1);
        System.out.println(equals1);


        while(true){
            System.out.println("h");
        }

    }

    public static void show(int[] arr, int index) {
        if (index >= arr.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int ele = arr[index];
        System.out.println(ele);
    }
}
