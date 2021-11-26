package com.hn.a1026.pm;

public class Demo {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        // 取出数组中每一位元素
        for (int x = 0, d = arr.length - 1; x < d; x++, d--) {

//            int qian = arr[x];
//            int hou = arr[d];
            int a = arr[x];
            arr[x] = arr[d];
            arr[d] = a;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
