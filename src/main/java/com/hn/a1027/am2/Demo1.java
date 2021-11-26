package com.hn.a1027.am2;

import java.util.ArrayList;

public class Demo1 {

    public static void main(String[] args) throws Throwable {

        Demo1 demo1 = new Demo1();
        demo1.finalize();


        System.out.println(demo1);
        System.out.println(demo1);
        System.out.println(demo1);

        System.gc();





    }
}
