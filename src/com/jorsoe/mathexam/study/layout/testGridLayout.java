package com.jorsoe.mathexam.study.layout;

import javax.swing.*;
import java.awt.*;

/**
 * @auther Jorsoe
 * @date 2020/5/17 23:00
 */
public class testGridLayout {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(800,200);
        jFrame.setTitle("网格布局");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);

        //GridLayout gridLayout = new GridLayout(3,3,10,10);

        //创建中间容器并设置网格布局
        JPanel jPanel = new JPanel(new GridLayout(3,3,10,10));
        for (int i=0;i<9;i++){
            JButton jButton = new JButton("button"+i+1);
            jPanel.add(jButton);
        }

        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
