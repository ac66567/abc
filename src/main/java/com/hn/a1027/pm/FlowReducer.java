package com.hn.a1027.pm;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class FlowReducer extends Reducer<Text, FlowBean, Text, FlowBean> {
    @Override
    protected void reduce(Text key, Iterable<FlowBean> values, Context context) throws IOException, InterruptedException {
        Long up = 0l, down = 0l;
        for (FlowBean fb : values) {
            Long upFlow = fb.getUpFlow();
            Long downFlow = fb.getDownFlow();
            up += upFlow;
            down += downFlow;
        }

        FlowBean fb = new FlowBean(up, down);
        context.write(key, fb);
    }
}
