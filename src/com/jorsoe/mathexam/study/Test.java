package com.jorsoe.mathexam.study;

import javax.swing.*;

/**
 * @auther Jorsoe
 * @date 2020/5/17 22:19
 */
public class Test {

    public static void main(String[] args) {
        //顶层容器
        JFrame jFrame = new JFrame();
        //设置大小
        jFrame.setSize(400,400);
        //设置居中
        jFrame.setLocationRelativeTo(null);
        //设置标题
        jFrame.setTitle("ningxiaobin nb!");
        //设置不可调整大小
        jFrame.setResizable(false);
        //设置关闭窗口即关闭JVM
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //中间容器
        JPanel jPanel = new JPanel();
        //按钮内容
        JButton jButton = new JButton("ningxiaobin");
        //按钮添加到中间容器
        jPanel.add(jButton);
        //中间容器添加到容器
        jFrame.setContentPane(jPanel);
        //实例化
        jFrame.setVisible(true);
    }
}
