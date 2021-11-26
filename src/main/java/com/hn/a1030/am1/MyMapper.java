package com.hn.a1030.am1;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class MyMapper extends Mapper<LongWritable, Text, FlowBean, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

        String[] split = value.toString().split("\t");
        String phone = split[3];
        String up = split[0];
        String down = split[1];
        FlowBean flowBean = new FlowBean(Long.parseLong(up), Long.parseLong(down));
        Text text = new Text(phone);
        context.write(flowBean, text);
    }
}
