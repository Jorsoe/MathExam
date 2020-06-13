package com.jorsoe.mathexam.view;

import javax.swing.*;

/**
 * @auther Jorsoe
 * @date 2020/6/13 11:12
 */
public class CreatePercentFrame {
    public static void createGUI(double right, double error)
    {
        // JFrame指一个窗口，构造方法的参数为窗口标题
        JFrame frame = new PercentageFrame("正确率",right,error);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗口的其他参数，如窗口大小
        frame.setSize(500, 400);
        // 显示窗口
        frame.setVisible(true);
    }
}
