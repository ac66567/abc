package com.hn.a1028.am;

import java.lang.reflect.Method;
import java.util.Properties;

public class TestDemo {

    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(TestDemo.class.getClassLoader().getResourceAsStream("my.properties"));

        String myClass = properties.getProperty("myClass");
        String myMethod = properties.getProperty("myMethod");

        Class aClass = Class.forName(myClass);

        System.out.println(aClass);

        Object o = aClass.newInstance();
        System.out.println(o);

        Method m = aClass.getMethod(myMethod, Class.forName("java.lang.String"));
        Object invoke = m.invoke(o, "ll");
        System.out.println(invoke);


//        Method[] methods = aClass.getDeclaredMethods();
//        for (int i = 0; i < methods.length; i++) {
//            Method method = methods[i];
//            String name = method.getName();
//            System.out.println(name);
//            if (name.equals(myMethod)) {
//                method.invoke(o);
//            }
//        }


//
//        Method getName = aClass.getMethod("getName");
//        Object invoke = getName.invoke(o);
//        System.out.println(invoke);


    }
}
