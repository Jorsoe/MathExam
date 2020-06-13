package com.jorsoe.mathexam.view;

import com.jorsoe.mathexam.model.Part;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @auther Jorsoe
 * @date 2020/6/13 11:02
 */
public class PieChart  extends JPanel
    {
        //数据：pie表示一小块
        private List<Part> partList =new ArrayList<>();

        //color如果为null，则由内部自动分配
        public void addPart(double amount, Object tag, Color color)
        {
            if(amount<=0)return;

            Part p=new Part();
            p.amount=amount;
            p.tag=tag;
            p.color=color;

            //随机产生一种颜色
            if(color==null)
            {
                int rgb=new Random().nextInt(0xFFFFFF);
                p.color=new Color(rgb);
            }
            partList.add(p);
        }

        //根据每一个饼的数值，分配角度，自动分配颜色
        private void calculate()
        {
            if(partList.size()==0) return;

            //求出总数量
            double totalAmount=0;
            for(Part p : partList)
                totalAmount=totalAmount+p.amount;

            //分配每一份所占的角度
            int totalDegrees=0;
            for(int i=0;i<partList.size();i++)
            {
                Part p=partList.get(i);
                p.degree=(int)(360*p.amount/totalAmount);
                if(p.degree<3)
                    p.degree=3; //有的份额太小，最低分配3角度
                if(i==partList.size()-1)
                    p.degree=360-totalDegrees;  //确保占满360度
                totalDegrees+=p.degree;
            }

            //取得一个最大的正方形
            int width=this.getWidth();
            int height=this.getHeight();
            int w=width;
            int h=width;
            if(h>height)
            {
                h=height;
                w=height;
            }
            Rectangle rect = new Rectangle((width-w)/2,(height-h)/2,w,h);
            rect.grow(-4, -4);  //往里面缩一点

            //计算每一个扇形的形状
            int start=90;
            for(Part p : partList)
            {
                p.shape=new Arc2D.Double(rect, start, p.degree, Arc2D.PIE);
                start=start+p.degree;
            }
        }

        @Override
        protected void paintComponent(Graphics g)
        {
            // TODO Auto-generated method stub
            super.paintComponent(g);

            int width = getWidth();
            int height = getHeight();
            Graphics2D g2d = (Graphics2D) g;

            // 平滑绘制 （ 反锯齿 )
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            //计算每一份额的角度和扇形
            this.calculate();
            for(Part p:partList)
            {
                if(p.shape != null)
                {
                    g2d.setPaint( p.color);
                    g2d.fill( p.shape );
                }
            }
        }


    }
