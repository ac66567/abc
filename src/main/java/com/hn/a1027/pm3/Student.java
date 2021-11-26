package com.hn.a1027.pm3;

//javaBean 对象
public class Student {
    // 成员变量
    private String name;
    private int age;
    private String sex;

    //构造方法  为了成员变量附初始值
    // 无参数构造方法
    public Student() {

    }

    // 有参数构造方法
    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(int age, String name) {
        this.name = name;
        this.age = age;
    }

    //成员方法
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
