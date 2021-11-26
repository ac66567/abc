package com.hn.a1025.pm1;

public class Demo4 {

    public static void main(String[] args) {
//
//        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88};
//        //增强for forEach  i 迭代 代替 arr数组中每个元素
//        for (int i : arr) {
//            System.out.println(i);
//        }


//        int i = arr.length;
//        System.out.println(i);
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
//        System.out.println(arr[5]);
//        System.out.println(arr[6]);
//        System.out.println(arr[7]);
//        System.out.println(arr[8]);
//        System.out.println(arr[9]);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }


        int[] arr1 = {123, 12, 343, 25, 43, 65, 63, 574, 32, 52};
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            int a = arr1[i];
            if (a > max) {
                max = a;
            }
        }
        System.out.println(max);

//        int min = arr1[0];
//        for (int i = 1; i < arr1.length; i++) {
//            int b = arr1[i];
//            if (b < min) {
//                min = b;
//            }
//        }
//        System.out.println(min);

    }
}
