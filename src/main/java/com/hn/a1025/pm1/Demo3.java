package com.hn.a1025.pm1;

public class Demo3 {

    public static void main(String[] args) {

        int[] arr = new int[3];  // 0 0 0

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //System.out.println(arr[3]); // 数组索引越界异常 , 访问数组中不存在的索引  0 - 3-1

        arr = null;
        System.out.println(arr); // NullPointerException 空指针异常

    }
}
