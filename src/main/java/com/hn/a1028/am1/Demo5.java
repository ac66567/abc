package com.hn.a1028.am1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo5 {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("as1", 19, "男");
        Student stu2 = new Student("zs", 20, "男");
        Student stu3 = new Student("zs2", 19, "男");
        Student stu4 = new Student("zs", 18, "男");
        Student stu5 = new Student("zs", 21, "男");

        Collections.addAll(list, stu1, stu2, stu3, stu4, stu5);
        System.out.println(list);

        // 二次排序
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int res = o1.getAge() - o2.getAge();
                if (res == 0) {
                    res = o2.getName().charAt(0) - o1.getName().charAt(0);
                }
                return res;
            }
        });

        for (Student s : list) {
            System.out.println(s);
        }

//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
////                return o2.getAge() - o1.getAge();
//
//               // return o1.getAge() < o2.getAge() ? -1 : o1.getAge() == o2.getAge() ? 0 : 1;
//                return o1.getAge() < o2.getAge() ? 1 : o1.getAge() == o2.getAge() ? 0 : -1;
//            }
//        });
//        System.out.println(list);




//
//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
////                return o2.getAge() - o1.getAge();
//                 return o1.getAge() < o2.getAge() ? -1 : o1.getAge() == o2.getAge() ? 0 : 1;
//                //return o1.getAge() < o2.getAge() ? 1 : o1.getAge() == o2.getAge() ? 0 : -1;
//            }
//        });
//
//        System.out.println(list);
    }
}
