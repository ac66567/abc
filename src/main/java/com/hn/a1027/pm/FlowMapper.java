package com.hn.a1027.pm;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;

import java.io.IOException;
import java.util.Arrays;

public class FlowMapper extends Mapper<LongWritable, Text, Text, FlowBean> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

        InputSplit inputSplit = context.getInputSplit();
        FileSplit fs = (FileSplit) inputSplit;
        System.err.println(fs.getPath().getName());

        String str = value.toString();
        String[] strings = str.split(" ");
        String phone = strings[1];
        String up = strings[strings.length - 4];
        String down = strings[strings.length - 3];
        long up1 = Long.parseLong(up);
        long down1 = Long.parseLong(down);
        FlowBean fb = new FlowBean(up1, down1);

        context.write(new Text(phone), fb);
    }
}
