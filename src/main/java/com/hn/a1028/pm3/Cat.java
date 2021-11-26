package com.hn.a1028.pm3;

public class Cat {

    private String name;
    private int age;
    // 构造方法, 初始化成员变量
    public Cat() {

    }
    public Cat(String name) {
        this.name = name;
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //get set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
