package com.hn.a1030.am3;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class GroupMapper extends Mapper<LongWritable, Text, OrderBean, NullWritable> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] str = value.toString().split("\t");

        //    00001     100
        OrderBean orderBean = new OrderBean(Integer.parseInt(str[0]) , Double.parseDouble(str[2]));
        context.write(orderBean, NullWritable.get());
    }
}
