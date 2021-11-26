package com.hn.a1027.pm1;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.CombineTextInputFormat;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.KeyValueLineRecordReader;
import org.apache.hadoop.mapreduce.lib.input.KeyValueTextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

public class KVDriverDemo {
    public static void main(String[] args) throws Exception {
        //加载配置文件
        Configuration conf = new Configuration();
        conf.set(KeyValueLineRecordReader.KEY_VALUE_SEPERATOR, ",");
        // Job
        Job job = Job.getInstance(conf);
        job.setJarByClass(KVDriverDemo.class);
        job.setMapperClass(KVMapper.class);
//        job.setReducerClass(WordReducer.class);

        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(Text.class);

//        job.setOutputKeyClass(Text.class);
//        job.setOutputValueClass(IntWritable.class);

        job.setNumReduceTasks(0);

//        job.setInputFormatClass(CombineTextInputFormat.class);
//        CombineTextInputFormat.setMaxInputSplitSize(job, 4194304);// 4m
//        CombineTextInputFormat.setMinInputSplitSize(job, 2097152);// 2m

        job.setInputFormatClass(KeyValueTextInputFormat.class);

        FileInputFormat.setInputPaths(job, "F://word/kv.txt");

        FileOutputFormat.setOutputPath(job, new Path("F://wordout3"));

        // 提交应用程序 , job任务
        boolean b = job.waitForCompletion(true);
        System.exit(b ? 0 : 1);

    }

}

class KVMapper extends Mapper<Text, Text, Text, Text> {
    @Override
    protected void map(Text key, Text value, Context context) throws IOException, InterruptedException {

        context.write(key, value);
    }
}