package com.hn.a1030.am;

import java.util.*;

public class DDZDemo {

    public static void main(String[] args) {
        // 牌的每一个编号   牌   1 大王   2 小王  53 红桃k
        HashMap<Integer, String> map = new HashMap<>();
        ArrayList<String> color = new ArrayList<>();
        ArrayList<String> number = new ArrayList<>();
        Collections.addAll(color, "♠", "♥", "♦", "♣");
        Collections.addAll(number,
                "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        int count = 0;
        map.put(count++, "大王");
        map.put(count++, "小王");
        for (String n : number) {
            for (String c : color) {
                String pai = c + n;
                map.put(count++, pai);
            }
        }
        System.out.println(map);

        Set<Integer> set = map.keySet();
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(set);
        Collections.shuffle(list);
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer pai = list.get(i);
            if (i >= 51) {
                diPai.add(pai);
            } else if (i % 3 == 0) {
                player1.add(pai);
            } else if (i % 3 == 1) {
                player2.add(pai);
            } else if (i % 3 == 2) {
                player3.add(pai);
            }
        }

        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(diPai);
        ArrayList<String> jack = new ArrayList<>();
        ArrayList<String> lucy = new ArrayList<>();
        ArrayList<String> rose = new ArrayList<>();
        ArrayList<String> diPai1 = new ArrayList<>();

//        for (int i = 0; i < player1.size(); i++) {
//            Integer integer = player1.get(i);
//            String pai = map.get(integer);
//            jack.add(pai);
//        }
//        for (int i = 0; i < player2.size(); i++) {
//            Integer integer = player2.get(i);
//            String pai = map.get(integer);
//            lucy.add(pai);
//        }
//
//        for (int i = 0; i < player3.size(); i++) {
//            Integer integer = player3.get(i);
//            String pai = map.get(integer);
//            rose.add(pai);
//        }

        for (int i = 0; i < 17; i++) {
//            Integer p1Num = player1.get(i);
//            Integer p2Num = player2.get(i);
//            Integer p3Num = player3.get(i);
//            String p1Pai = map.get(p1Num);
//            String p2Pai = map.get(p2Num);
//            String p3Pai = map.get(p3Num);
//            jack.add(p1Pai);
//            lucy.add(p2Pai);
//            rose.add(p3Pai);
            jack.add(map.get(player1.get(i)));
            lucy.add(map.get(player2.get(i)));
            rose.add(map.get(player3.get(i)));
        }
        for (int i = 0; i < diPai.size(); i++) {
            Integer integer = diPai.get(i);
            String pai = map.get(integer);
            diPai1.add(pai);
        }
        System.out.println(jack);
        System.out.println(lucy);
        System.out.println(rose);
        System.out.println(diPai1);


//        Collection<String> values = map.values();
//        ArrayList<String> list = new ArrayList<>();
//        list.addAll(values);
//        Collections.shuffle(list);
//        ArrayList<String> player1 = new ArrayList<>();
//        ArrayList<String> player2 = new ArrayList<>();
//        ArrayList<String> player3 = new ArrayList<>();
//        ArrayList<String> diPai = new ArrayList<>();
//
//        System.out.println(list);
//        for (int i = 0; i < list.size(); i++) {
//            String pai = list.get(i);
//            if (i >= 51) {
//                diPai.add(pai);
//            } else if (i % 3 == 0) {
//                player1.add(pai);
//            } else if (i % 3 == 1) {
//                player2.add(pai);
//            } else if (i % 3 == 2) {
//                player3.add(pai);
//            }
//        }
//
//
//        System.out.println(player1);
//        System.out.println(player2);
//        System.out.println(player3);
//        System.out.println(diPai);

    }
}
