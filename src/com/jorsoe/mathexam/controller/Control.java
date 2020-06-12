package com.jorsoe.mathexam.controller;

import com.jorsoe.mathexam.view.Display;
import javax.swing.*;
import static com.jorsoe.mathexam.view.Display.countLable;

/**
 * @auther Jorsoe
 * @date 2020/6/2 20:19
 */
public class Control {
    /**
     * 设置窗体属性
     * JFrame.EXIT_ON_CLOSE
     */
    public static void frame(){
        Display display = new Display();
        display.setTitle("Renke@NB!");
        display.setVisible(true);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display.setLocationRelativeTo(null);
        countLable();
    }
}
