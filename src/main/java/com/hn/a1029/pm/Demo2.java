package com.hn.a1029.pm;

import java.util.HashMap;

public class Demo2 {

    public static void main(String[] args) {

        HashMap<Student, String> map = new HashMap<>();
        Student stu1 = new Student("zss", 19);   //
        Student stu2 = new Student("ls", 19);
        Student stu3 = new Student("zs", 19);
        Student stu4 = new Student("zss", 19);   //
        Student stu5 = new Student("zss", 20);
        map.put(stu1, "北京");
        map.put(stu2, "广州");
        map.put(stu3, "上海");
        map.put(stu4, "南京");
        map.put(stu5, "台湾");

        System.out.println(map);


    }
}
