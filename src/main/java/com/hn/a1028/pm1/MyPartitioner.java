package com.hn.a1028.pm1;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class MyPartitioner extends Partitioner<Text, FlowBean> {
    @Override
    public int getPartition(Text text, FlowBean flowBean, int numPartitions) {

        String phone = text.toString();
        String sub = phone.substring(0, 2);
        if (sub.equals("13")) {
            return 1;
        } else if (sub.equals("15")) {
            return 2;
        } else if (sub.equals("18")) {
            return 3;
        } else {
            return 0;
        }
    }
}
