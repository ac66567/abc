package com.hn.a1027.pm;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class FlowDriver {

    public static void main(String[] args) throws Exception {

        //加载配置文件
        Configuration conf = new Configuration();
        // Job
        Job job = Job.getInstance(conf);
        job.setJarByClass(FlowDriver.class);
        job.setMapperClass(FlowMapper.class);
        job.setReducerClass(FlowReducer.class);

        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(FlowBean.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(FlowBean.class);

        FileInputFormat.setInputPaths(job, "F://log02.data");


        FileOutputFormat.setOutputPath(job, new Path("F://out121"));

        // 提交应用程序 , job任务
        boolean b = job.waitForCompletion(true);
        System.exit(b ? 0 : 1);

    }
}