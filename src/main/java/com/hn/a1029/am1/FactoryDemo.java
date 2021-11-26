package com.hn.a1029.am1;

public class FactoryDemo {

    private final int qq = 1;
    private final int tt = 2;
    private final int yy = 3;

    public Sender produce(int a) {
        switch (a) {
            case qq:
                return new QQ();
            case tt:
                return new TT();
            case yy:
                return new YY();
        }
        return null;
    }

}
