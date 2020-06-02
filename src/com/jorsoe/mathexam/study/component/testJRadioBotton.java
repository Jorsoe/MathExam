package com.jorsoe.mathexam.study.component;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * @auther Jorsoe
 * @date 2020/5/18 11:15
 */
public class testJRadioBotton {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("测试RadioBotton！");
        jFrame.setSize(600,400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();

        JRadioButton jRadioButtonMan = new JRadioButton("男",true);
        System.out.println(jRadioButtonMan.isSelected());

        JRadioButton jRadioButtonWoman = new JRadioButton("女",false);
        System.out.println(jRadioButtonWoman.isSelected());

        ButtonGroup buttonGroupSex = new ButtonGroup();
        buttonGroupSex.add(jRadioButtonMan);
        buttonGroupSex.add(jRadioButtonWoman);

        ChangeListener changeListener = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JRadioButton jtb = (JRadioButton)e.getSource();
                System.out.println("当前="+jtb.isSelected());
            }
        };
        jRadioButtonMan.addChangeListener(changeListener);

        jPanel.add(jRadioButtonMan);
        jPanel.add(jRadioButtonWoman);

        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
