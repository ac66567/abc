package com.hn.a1027.am;

//         泛型  我这个类现在不确定他使用什么类型
public class Person<PPP> {

    //
    public void show(PPP s) {
        System.out.println(s);
    }


    public <A> void play(A a) {
        System.out.println(a.getClass());
    }
}
