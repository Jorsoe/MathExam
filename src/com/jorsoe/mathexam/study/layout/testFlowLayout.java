package com.jorsoe.mathexam.study.layout;

import javax.swing.*;
import java.awt.*;

/**
 * @auther Jorsoe
 * @date 2020/5/17 22:44
 */
public class testFlowLayout {
    public static void main(String[] args) {
        //顶层容器
        JFrame jf = new JFrame();
        jf.setSize(400,400);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //中间容器
        JPanel jp = new JPanel(new FlowLayout());
        JButton jb1 = new JButton("nxbnb*1");
        JButton jb2 = new JButton("nxbnb*2");
        JButton jb3 = new JButton("nxbnb*3");
        JButton jb4 = new JButton("nxbnb*4");
        jp.add(jb1);
        jp.add(jb2);
        jp.add(jb3);
        jp.add(jb4);

        jf.setContentPane(jp);
        jf.setVisible(true);
    }
}
