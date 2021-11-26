package com.hn.a1028.pm;

import com.sun.media.jfxmediaimpl.platform.gstreamer.GSTPlatform;
import org.apache.commons.crypto.utils.IoUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;


import java.io.IOException;

public class MyInputFormat extends FileInputFormat<NullWritable, BytesWritable> {
    @Override
    public RecordReader<NullWritable, BytesWritable>
    createRecordReader(InputSplit split, TaskAttemptContext context)
            throws IOException, InterruptedException {
        MyRecordReader mrr = new MyRecordReader();
        mrr.initialize(split, context);
        return mrr;
    }
}

class MyRecordReader extends RecordReader<NullWritable, BytesWritable> {
    private FileSplit split;
    private Configuration configuration;
    private boolean processed = false;
    private BytesWritable bytesWritable = new BytesWritable();

    @Override
    public void initialize(InputSplit split, TaskAttemptContext context) throws IOException, InterruptedException {
        this.split = (FileSplit) split;
        configuration = context.getConfiguration();
    }

    @Override
    public boolean nextKeyValue() throws IOException, InterruptedException {
        if (!processed) {
            FileSystem fs = FileSystem.get(configuration);
            Path path = split.getPath();
            int length = (int) split.getLength();
            FSDataInputStream in = fs.open(path);

            byte[] bytes = new byte[length];

            IoUtils.readFully(in, bytes, 0, length);
            bytesWritable.set(bytes, 0, length);

            processed = true;
            return true;
        }
        return false;
    }

    @Override
    public NullWritable getCurrentKey() throws IOException, InterruptedException {
        return NullWritable.get();
    }

    @Override
    public BytesWritable getCurrentValue() throws IOException, InterruptedException {
        return bytesWritable;
    }

    @Override
    public float getProgress() throws IOException, InterruptedException {
        return processed ? 1 : 0;
    }

    @Override
    public void close() throws IOException {
    }
}