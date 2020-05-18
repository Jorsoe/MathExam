package com.jorsoe.mathexam.study.layout;

import javax.swing.*;

/**
 * 测试箱式布局
 * @auther Jorsoe
 * @date 2020/5/18 0:14
 */
public class textBoxLayout {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(800,400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //创建按钮
        JButton jButton1 = new JButton("ning");
        JButton jButton2 = new JButton("ning");
        JButton jButton3 = new JButton("ning");
        JButton jButton4 = new JButton("ning");
        JButton jButton5 = new JButton("ning");

        //创建水平箱子容器
        Box hBox1 = Box.createHorizontalBox();
        hBox1.add(jButton1);
        hBox1.add(jButton2);
        hBox1.add(jButton3);

        //创建水平箱子容器
        Box hBox2 = Box.createHorizontalBox();
        hBox2.add(jButton4);
        hBox2.add(Box.createHorizontalGlue());      //添加水平胶状不可见填充物
        hBox2.add(jButton5);

        //创建垂直箱子容器
        Box vBox = Box.createVerticalBox();
        vBox.add(hBox1);
        vBox.add(hBox2);

        //将大盒子添加到面板
        jFrame.setContentPane(vBox);
        jFrame.pack();      //去除空白
        jFrame.setVisible(true);
    }
}
