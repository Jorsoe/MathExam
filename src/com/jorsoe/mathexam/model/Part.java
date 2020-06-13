package com.jorsoe.mathexam.model;

import java.awt.*;
import java.awt.geom.Arc2D;

/**
 * @auther Jorsoe
 * @date 2020/6/13 11:01
 */
public class Part {
    public double amount;      //该块区域所代表的数量
    public int degree;         //根据amount经计算得到
    public Color color;        //图例颜色
    public Object tag;         //相关数据对象，由外部指定
    public Arc2D shape;        //实际绘制的形状

    public Part() {
    }

    /**
     * 全参构造函数
     * @param amount
     * @param degree
     * @param color
     * @param tag
     * @param shape
     */
    public Part(double amount, int degree, Color color, Object tag, Arc2D shape) {
        this.amount = amount;
        this.degree = degree;
        this.color = color;
        this.tag = tag;
        this.shape = shape;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Object getTag() {
        return tag;
    }

    public void setTag(Object tag) {
        this.tag = tag;
    }

    public Arc2D getShape() {
        return shape;
    }

    public void setShape(Arc2D shape) {
        this.shape = shape;
    }
}
