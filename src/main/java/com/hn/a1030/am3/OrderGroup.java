package com.hn.a1030.am3;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class OrderGroup extends WritableComparator {

    public OrderGroup() {
        super(OrderBean.class, true);
    }

    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        OrderBean a1 = (OrderBean) a;
        OrderBean b1 = (OrderBean) b;
        if (a1.getId() > b1.getId()) {
            return 1;
        } else if (a1.getId() < b1.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}
