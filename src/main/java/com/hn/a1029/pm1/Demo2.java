package com.hn.a1029.pm1;

public class Demo2 {

    public static void main(String[] args) {

        //创建对象
        Student stu = new Student();
//        System.out.println(stu.getName());
//        System.out.println(stu.getAge());
//        System.out.println(stu.getSex());

        Student stu1 = new Student("张三", 19, "男");
//        System.out.println(stu1.getName());
//        System.out.println(stu1.getAge());
//        System.out.println(stu1.getSex());


        stu1.study();
//        stu1.eat();

        stu.study();

//        stu1.setSex("人妖");
//
//        System.out.println(stu1.getSex());


    }

}
