package com.hn.a1027.pm1;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class WordMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

   static int lineNum = 0;

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        System.err.println("行号:" + ++lineNum+"\t 偏移量"+key +"\t 内容:" +value.toString());
        String[] strings = value.toString().split(" ");
        for (String str : strings) {
            context.write(new Text(str), new IntWritable(1));
        }
    }
}
