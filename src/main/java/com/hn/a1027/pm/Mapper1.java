//package com.hn.a1027.pm;
//
//import org.apache.hadoop.io.LongWritable;
//import org.apache.hadoop.io.Text;
//import org.apache.hadoop.mapreduce.InputSplit;
//import org.apache.hadoop.mapreduce.Mapper;
//import org.apache.hadoop.mapreduce.lib.input.FileSplit;
//import org.json4s.FileInput;
//
//import java.io.IOException;
//
//public class Mapper1 extends Mapper<LongWritable, Text, Text, FlowBean> {
//    FlowBean v = new FlowBean();
//    Text k = new Text();
//
//    @Override
//    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
//
//        InputSplit inputSplit = context.getInputSplit();
//        FileSplit fs = (FileSplit) inputSplit;
//        System.err.println(fs.getPath());
//
//        String line = value.toString();
//        String[] strings = line.split(" ");
//        String phone = strings[1];
//        k.set(phone);
//
////        new Text(phone);
//        String up = strings[strings.length - 4];
//        String down = strings[strings.length - 3];
//
//        long upFlow = Long.parseLong(up);
//        long downFlow = Long.parseLong(down);
//        v.set(upFlow, downFlow);
//
//        context.write(k, v);
//    }
//}
