package com.hn.a1027.pm3;

public class Dog {

    // 给成员变量赋初始值
    public Dog() {

    }

    // 方法重载
    public Dog(String name) {
        this.name = name;
    }

    public Dog(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // 成员变量 --- 属性
    // 成员变量 有默认值
    private String name;
    private int age;
    String color;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    // 标识符   见名知意
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


//    // 成员方法 --- 行为
//    public void sleep() {
//        System.out.println("睡觉");
//
//        System.out.println(name);
//
//        int a = 10;
//        System.out.println(a);
//
//    }
//
//    public void eat() {
//        System.out.println("吃饭");
//
//        System.out.println(age);
//
//    }


}
