package com.hn.a1025.pm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>();
        list.add("100");
        list.add("200");
        list.add("300");
        list.add("400");
        list.add("400");
        list.add("400");

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println(str);
        }

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        //增强for forEach  迭代器
//        for(String s : list){
//            System.out.println(s);
//        }
//        boolean b = list.add("500");
//        System.out.println(true);
//
//        System.out.println(list);
//        list.clear();
//        System.out.println(list);
//
//        boolean remove = list.remove("500");
//        System.out.println(remove);
//        System.out.println(list);
//
//        boolean contains = list.contains("500");
//        System.out.println(contains);
//
//        list.clear();
//        boolean empty = list.isEmpty();
//        System.out.println(empty);
//
//        System.out.println(list.size());
//
//        Object[] obj = list.toArray();
//        System.out.println(Arrays.toString(obj));
    }
}
