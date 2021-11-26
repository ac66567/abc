package com.hn.a1029.pm;

import java.util.HashMap;
import java.util.Scanner;

public class Demo4 {

    public static void main(String[] args) {
        //  计算一个字符串中每个字符出现次数。
        System.out.println("请输入字符串");
        String str = new Scanner(System.in).nextLine();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            //取出字符串中指定位置的字符
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                int num = map.get(c) + 1;
                map.put(c, num);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);


    }
}
