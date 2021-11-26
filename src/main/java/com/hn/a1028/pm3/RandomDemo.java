package com.hn.a1028.pm3;

import java.util.Random;

public class RandomDemo {

    public static void main(String[] args) {

        Random random = new Random();
        // 0 - 9
//        int i = random.nextInt(10);
//        System.out.println(i);
//
//        int i1 = random.nextInt();
//        // int 取值范围内所有数字
//        System.out.println(i1);

//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);

//        int i = random.nextInt(10);
//        System.out.println(i);
//        int i1 = random.nextInt(10);
//        System.out.println(i1);
//        int i2 = random.nextInt(10);
//        System.out.println(i2);

        for (int i = 1; i <= 6; i++) {
            int i1 = random.nextInt(10);
            System.out.println(i1);
        }

        System.out.println("----------------");
        int i = new Random().nextInt();
        System.out.println(i);

        //   0 - 9  3 - 12
        int i1 = random.nextInt(10) + 3;
        System.out.println(i1);

        // 0 -  6    7 - 13
        int i2 = random.nextInt(7) + 7;
        System.out.println(i2);

        //0 - 4  23 - 27
        int i3 = random.nextInt(5) + 23;
        System.out.println(i3);


        // 17 - 21
        int i4 = random.nextInt(5) + 17;
        System.out.println(i4);
    }
}
