package com.jorsoe.mathexam.view;

import javax.swing.*;
import java.awt.*;

/**
 * @auther Jorsoe
 * @date 2020/6/13 11:06
 */
public class PercentageFrame extends JFrame{
    public PercentageFrame(String title,double right,double error) {
        super(title);
        //内容面板
        JPanel root=new JPanel();
        this.setContentPane(root);
        root.setLayout(new BorderLayout());

        PieChart chart = new PieChart();
        root.add(chart, BorderLayout.CENTER);

        chart.addPart(right, "Right", Color.GREEN);
        chart.addPart(error, "Error", Color.RED);;
    }
}
