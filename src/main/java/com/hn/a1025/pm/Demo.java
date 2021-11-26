package com.hn.a1025.pm;

import java.util.Arrays;

public class Demo {

    static int a;

    public static void main(String[] args) {


//        double d = 5 / 3;
//        System.out.println(d);
//
//        float f = 5.5f;
//
//        double d1 = 3;
//
//        System.out.println('a' + 1);

        int i = 1;
        int j = 0;
        // ++ 在变量后,先运算在自身加1
        j = i++;
        System.out.println(i); // 2
        System.out.println(j); // 1


//        int num = 9;
//        System.out.println(num++);
//
//        for (; ; ){
//
//        }
//
//        int i2 = 10;
//        double d1 = 10;
//
//        System.out.println("");

//        String a = "true";
//        switch (a) {
//
//
//        }

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr1 = new int[10];

        for (int k = 0; k < arr.length; k++) {
           arr1[k] = arr[k];
        }



//        System.arraycopy(arr, 0, arr1, 0, arr.length);
        for (int i1 : arr1) {
            System.out.println(i1);
        }


//
//        String s = Arrays.toString(arr1);
//        System.out.println(s);

    }


}
