package com.jorsoe.mathexam.study.component;

import javax.swing.*;
import java.awt.*;

/**
 * 测试标签JLabel
 * @auther Jorsoe
 * @date 2020/5/18 0:54
 */
public class TestJLabel {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(600,400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //创建中间容器
        JPanel jPanel = new JPanel();       //默认FlowLayout
        //设置JLable--文字
        JLabel jLabel1 = new JLabel();
        //设置Jlable属性
        jLabel1.setText("renkenb!");
        jLabel1.setFont(new Font(null,Font.PLAIN,25));
        jPanel.add(jLabel1);

        //设置JLabel--图片
        JLabel jLabel2 = new JLabel();
        jLabel2.setIcon(new ImageIcon("image/outdoor.jpg"));
        jLabel2.setBounds(40,40,40,40);
        jPanel.add(jLabel2);

        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
