package com.hn.a1029.am4;

public class SimpleStudent {

    private SimpleStudent() {
        new Student();
    }

//    // 单例模式  懒汉
//    private static Student stu;
//
//    public static Student createStu() {
//        if (stu == null) {
//            stu = new Student();
//            return stu;
//        } else {
//            return stu;
//        }
//    }

    // 单例模式  饿汉
    private static Student stu = new Student();

    public static Student createStu() {
        return stu;
    }

}
