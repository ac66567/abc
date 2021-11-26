package com.hn.a1025.pm1;

public class Demo2 {

    public static void main(String[] args) {

        int[] a = new int[3];
        System.out.println(a);   // [I@1b6d3586
        int[] arr1 = a;
        int[] arr2 = a;
        System.out.println(arr1);
        System.out.println(arr2);

        System.out.println(arr1[0]);  // 0
        System.out.println(arr2[0]);  // 0


        arr1[0] = 55;
        System.out.println(arr1[0]);  // 55

        System.out.println(arr2[0]);  // 55

        arr2[0] = 10;
        System.out.println(arr1[0]);  // 10

    }
}
