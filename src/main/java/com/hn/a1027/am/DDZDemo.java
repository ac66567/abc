package com.hn.a1027.am;

import java.util.ArrayList;
import java.util.Collections;

public class DDZDemo {

    public static void main(String[] args) {

        ArrayList<String> number = new ArrayList<>();
        ArrayList<String> color = new ArrayList<>();
        number.add("A");
        for (int i = 2; i <= 10; i++) {
            number.add(i + "");
        }
        number.add("J");
        number.add("Q");
        number.add("K");
        color.add("♣");
        color.add("♦");
        color.add("♥");
        color.add("♠");
        ArrayList<String> paiBox = new ArrayList<>();
        for (String c : color) {
            for (String n : number) {
                String pai = n + c;
                paiBox.add(pai);
            }
        }
        paiBox.add("大王");
        paiBox.add("小王");
        System.out.println(paiBox);

        // 操作集合的一个类   shuffle 清洗 洗牌
        Collections.shuffle(paiBox);
        System.out.println(paiBox);

        // 底牌集合
        ArrayList<String> diPai = new ArrayList<>();
        // 三个玩家
        ArrayList<String> jack = new ArrayList<>();
        ArrayList<String> lucy = new ArrayList<>();
        ArrayList<String> rose = new ArrayList<>();
        for (int i = 0; i < paiBox.size(); i++) {
            // 取出每一张牌
            String pai = paiBox.get(i);
            // 判断 看 索引大于51
            if (i >= paiBox.size() - 3) {
                diPai.add(pai);
            } else if (i % 3 == 0) {
                jack.add(pai);
            } else if (i % 3 == 1) {
                lucy.add(pai);
            } else {
                rose.add(pai);
            }
        }

        Collections.sort(diPai);
        Collections.sort(jack);
        Collections.sort(rose);
        Collections.sort(lucy);
        System.out.println(diPai);
        System.out.println(jack);
        System.out.println(lucy);
        System.out.println(rose);

    }
}
