package com.hn.a1028.am;

public class Student {

    private String name  = "赵六";

    private int age;

    public  int id;
    public  int id1;
    public  int id2;

//    private Student(String name) {
//        this.name = name;
//    }
    public Student() {
    }
    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student(int age, int id) {
        this.age = age;
        this.id = id;
    }

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

    private  void show(){
    }
    private void play(){

    }
}
