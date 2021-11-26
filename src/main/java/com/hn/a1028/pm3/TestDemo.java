package com.hn.a1028.pm3;

import java.util.Random;
import java.util.Scanner;

public class TestDemo {

    public static void main(String[] args) {

        int sjs = new Random().nextInt(100) + 1; // 0 - 99   1-100
        Scanner sc = new Scanner(System.in);

        // 就让猜五次猜不着结束
        int count = 0;
        while (count < 5) {
            System.out.println("请你猜一猜我先心里想的数字..");
            int me = sc.nextInt();
            if (me > sjs) {
                System.out.println("你猜的数字比我想的 大");
            } else if (me < sjs) {
                System.out.println("你猜的数字比我想的 小");
            } else {
                System.out.println("恭喜你猜对了...");
                break;
            }
            count++;
        }


    }
}
