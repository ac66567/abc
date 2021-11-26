package com.hn.a1027.am;

import java.util.ArrayList;

public class Demo4 {

    public static void main(String[] args) {

//        ArrayList<String> list = new ArrayList<>();

        ImplDemo<Number> stringImplDemo = new ImplDemo<>();
        show(stringImplDemo);

        ImplDemo<Object> integerImplDemo = new ImplDemo<>();
        show(integerImplDemo);

        String s = String.valueOf(100);
        String s1 = 100+"";
        String s2 = new StringBuilder(100).toString();

    }

    public static void show(ImplDemo<? super Integer>   d) {

    }
}
