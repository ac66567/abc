package com.hn.a1026.pm;

public class Demo2 {

    public static void main(String[] args) {

        // 局部 变量
//        int a = 10;
//        int b = show(a);
//        System.out.println(a); //10
//        System.out.println(b); //11


        int[] a = show();
        System.out.println(a);
        System.out.println(a[0]); //11




    }

    public static int[] show() {
        int[] arr = {11, 223, 34, 54};
        System.out.println(arr);
        return arr;
    }

//    public static int show(int a) {
//        return a + 1;
//    }
}
