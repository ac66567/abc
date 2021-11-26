package com.hn.a1026.am1;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class FlowDriver1 {

    public static void main(String[] args) throws Exception{
        //加载配置文件
        Configuration conf = new Configuration();
        // Job
        Job job = Job.getInstance(conf);
        job.setJarByClass(FlowDriver1.class);
        job.setMapperClass(FlowMapper1.class);
        job.setReducerClass(FlowReducer1.class);

        job.setMapOutputKeyClass(FlowBean.class);
        job.setMapOutputValueClass(Text.class);

        job.setOutputKeyClass(FlowBean.class);
        job.setOutputValueClass(Text.class);

        FileInputFormat.setInputPaths(job, "F://out11");
        FileOutputFormat.setOutputPath(job, new Path("F://out22"));

        boolean b = job.waitForCompletion(true);
        System.exit(b ? 0 : 1);



    }
}
