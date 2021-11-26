package com.hn.a1030.am;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {

        HashMap<Character, Integer> map = new HashMap<>();
        boolean a = map.containsKey('a');
        System.out.println(a);

        String str = new Scanner(System.in).nextLine();
//        char[] chars = str.toCharArray();

//        // abcabcabcaaa
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                Integer count = map.get(c);
                count++;
                map.put(c, count);
            }

        }

        System.out.println(map);


    }
}
