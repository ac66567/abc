package com.hn.a1025.pm1;

public class Demo1 {
    public static void main(String[] args) {

        int[] arr1 = new int[3];  // [I@1b6d3586
        int[] arr2 = new int[3];  // [I@4554617c

        System.out.println(arr1);
        System.out.println(arr2);

        System.out.println(arr1[0]); // 0
        System.out.println(arr2[0]); // 0

        arr1[0] = 100;
        System.out.println(arr1[0]); // 100
        System.out.println(arr2[0]); // 0



    }
}
