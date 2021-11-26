package com.hn.a1028.pm2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlowMapper extends Mapper<LongWritable, Text, FlowBean, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] split = value.toString().split("\t");
        String phone = split[0];
        long up = Long.parseLong(split[1]);
        long down = Long.parseLong(split[2]);
        FlowBean flowBean = new FlowBean(up, down);

        context.write(flowBean, new Text(phone));

    }
}
