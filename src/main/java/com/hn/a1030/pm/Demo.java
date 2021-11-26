package com.hn.a1030.pm;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        // 数据存储结构两大类
        // Collection 单列集合  Map 双列集合
        // List Set
        // List有序, 元素可重复, 有索引
        // Set 无序 ,不可重复(equals ,hashCode) ,没有索引
        // ArrayList  LinkedList
        // Vector 线程安全的集合
        // for i forEach Iterator

        // HashSet  底层HashTable
        // LinkedHashSet 不是Set子类, HashSet子类
        // TreeSet 树状结构
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(11);
        set.add(9);

        System.out.println(set);
        System.out.println(set.first().hashCode());
        System.out.println(set.last().hashCode());
        System.out.println();

        // forEach Iterator

        // Map 无序, key不重复 , value可重复
        //HashMap  HashTable
        // for i   forEach  Iterator
        // keySet()  Set  map.get(k)
        // entrySet()  Set<Map.Entry<K,V>>  getKey()  getValue()
//        TreeMap<Integer, String> map = new TreeMap<>();
//        map.put(1,"zs");
//        map.put(2,"zs");
//        map.put(5,"zs");
//        map.put(3,"zs");
//        map.put(6,"zs");
//        System.out.println(map);
//
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(1,"zs");
        map1.put(2,"zs");
        map1.put(5,"zs");
        map1.put(3,"zs");
        map1.put(6,"zs");
        System.out.println(map1);

        Set<Integer> set1 = map1.keySet();
        ArrayList<String> values = (ArrayList)map1.values();

    }
}
