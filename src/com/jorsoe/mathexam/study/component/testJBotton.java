package com.jorsoe.mathexam.study.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @version LeetCode 1.2.1
 * @auther Jorsoe
 * @date 2020/5/18 10:32
 */
public class testJBotton {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("ceshianniu");
        jFrame.setSize(800,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);

        JPanel jPanel = new JPanel();
        JButton jButton1 = new JButton("Botton 1");
        jButton1.setFont(new Font("楷体",Font.PLAIN,18));
        jButton1.setForeground(Color.black);
        jButton1.setEnabled(true);
        jPanel.add(jButton1);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object obj = e.getSource();
                if (obj.equals(jButton1)){
                    System.out.println("监听按钮完毕！");
                }
            }
        };
        jButton1.addActionListener(listener);

        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
