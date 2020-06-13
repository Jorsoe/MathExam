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
}
