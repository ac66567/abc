package com.hn.a1029.pm1;

public class Student {

    //空参构造方法
    public Student() {

    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    // 成员变量 封装
    private String name;
    private int age;
    private String sex;

    // get set 方法 访问封装的成员变量
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void study() {
        System.out.println(name);
        System.out.println("好好学习,天天向上");
    }

    public void eat() {
        System.out.println("吃饭");
    }
}
