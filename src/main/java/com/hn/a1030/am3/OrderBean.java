package com.hn.a1030.am3;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class OrderBean implements WritableComparable<OrderBean> {

    private int id;
    private double price;

    public OrderBean() {
    }

    public OrderBean(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(OrderBean o) {
        int res = id - o.id;
        if (res == 0) {
            res = (int) (o.price - this.price);
        }
        return res;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(id);
        out.writeDouble(price);
    }

    @Override
    public void readFields(DataInput in) throws IOException {
        id = in.readInt();
        price = in.readDouble();
    }

    @Override
    public String toString() {
        return "OrderBean{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}
