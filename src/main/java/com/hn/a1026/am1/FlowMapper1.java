package com.hn.a1026.am1;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlowMapper1 extends Mapper<LongWritable, Text, FlowBean, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        // 13243983434	997112156	995554697	1992666853
        String[] strings = value.toString().split("\t");

        long up = Long.parseLong(strings[1]);
        long down = Long.parseLong(strings[2]);
        FlowBean fb = new FlowBean(up, down);

        context.write(fb, new Text(strings[0]));

    }
}
