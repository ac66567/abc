package com.hn.a1030.am1;


import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class MyPartition extends Partitioner<FlowBean, Text> {

    @Override
    public int getPartition(FlowBean flowBean, Text text, int numPartitions) {
        String s = text.toString();
        if (s.contains("13")) {
            return 1;
        } else if (s.contains("15")) {
            return 2;
        }
        return 0;
    }
}
