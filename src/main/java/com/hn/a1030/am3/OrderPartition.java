package com.hn.a1030.am3;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Partitioner;

public class OrderPartition extends Partitioner<OrderBean, NullWritable> {

    @Override
    public int getPartition(OrderBean orderBean, NullWritable nullWritable, int numPartitions) {
        int id = orderBean.getId();
        if(id == 1){
            return 1;
        }else if(id == 2){
            return 2;
        }else if(id == 3){
            return 3;
        }else {
            return 0;
        }

    }
}
