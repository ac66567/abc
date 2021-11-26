package com.hn.a1027.am;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {

    public static void main(String[] args) {

        Collection list = new ArrayList<>();
        list.add("100");
        list.add("3.14");
        list.add(true);
        list.add("hello");
        list.add('a');

        Collection<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("aaa");
        list1.add( "true" );

        for (Object s : list) {
            String s1 = (String) s;
            System.out.println(s1);
//            System.out.println(s);
//            String s1 = s.toString();
//            double i = Double.parseDouble(s1);
//            System.out.println(i);
        }


    }
}
