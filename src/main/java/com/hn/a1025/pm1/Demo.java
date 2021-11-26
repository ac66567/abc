package com.hn.a1025.pm1;

public class Demo {

    public static void main(String[] args) {

        int[] arr = new int[3];

        System.out.println(arr); //[I@1b6d3586
        System.out.println(arr[0]);  //访问数组索引0位置元素
//        int a = arr[0];
//       System.out.println(a);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // 向数组索引0位置赋值
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);


    }
}
