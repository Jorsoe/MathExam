package com.jorsoe.mathexam.view;

/**
 * @auther Jorsoe
 * @date 2020/5.15 4:02
 */

import com.jorsoe.mathexam.model.ArithmeticProblem;
import com.jorsoe.mathexam.model.Deal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Display extends JFrame {

    public static ArithmeticProblem arithmeticProblem;
    public static JPanel countPanel;//创建计算面板
    public JPanel buttonPanel;//创建按钮及结果面板
    public static JButton clearButton;//创建清空按钮
    public static JButton resetButton;//创建重置按钮
    public static JButton printfButton;//创建打印按钮
    public static JLabel countLable;//创建正确率(标签),正确率在标签正呈现
    public static List<Integer> userList = new ArrayList<>();//创建存储用户计算结果的集合
    public static List<JLabel> labelList = new ArrayList<>();//创建题目(标签)集合,题目在标签中呈现
    public static List<JTextField> textFieldList = new ArrayList<>();//创建用户输入计算结果的文本框集合
    public static List<Integer> rightResultlist = new ArrayList<>();//创建所有题目正确答案集合
    public static int rightNum ;//设置用户答对的题数
    public static int j=0;
    public static int k=0;
    public static int i=0;

    /**
     * 初始化函数
     */
    public Display(){
        //初始化按钮
        clearButton = new JButton("清空");
        resetButton = new JButton("重置");
        printfButton = new JButton("核算");
        //设置按钮大小
        clearButton.setSize(50,100);
        resetButton.setSize(50,100);
        printfButton.setSize(50,100);
        //初始化计数面板
        countPanel = new JPanel();
        countPanel.setLayout(new GridLayout(25, 4));
        //初始化按钮面板
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.setSize(600,50);
        buttonPanel.setBorder(BorderFactory.createLineBorder(Color.RED));
        //buttonPanel.add(clearButton);
        countLable = new JLabel("                         ");
        countLable.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //将按钮添加至按钮及结果面板中
        buttonPanel.add(resetButton);
        buttonPanel.add(printfButton);
        buttonPanel.add(countLable);
        //设置窗体属性
        setLayout(new BorderLayout());
        setBounds(100,100,600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        //将计数面板,按钮面板放置在容器中指定位置
        container.add(countPanel, BorderLayout.NORTH);
        container.add(buttonPanel,BorderLayout.SOUTH);
    }

    /**
     * 设置CountPanel面板中的组件
     */
    public static void countLable(){
        for(i=0;i<100;i++){
            JLabel label = new JLabel();
            //重点:在设置布局的条件下,调用setPreferredSize(new Dimension(80, 20))可以设置标签的大小
            //重点:而不能调用setsize()方法
            label.setPreferredSize(new Dimension(40, 20));
            label.setFont(new Font("楷体",Font.BOLD, 20));
            label.setBorder(BorderFactory.createLineBorder(Color.black));//设置标签的边界
            labelList.add(label);//list为题目(标签)集合,题目在标签中呈现
            JTextField textField = new JTextField(4);
            textFieldList.add(textField);//list1为用户输入计算结果的文本框集合
        }
        for(i = 0;i<200;i++){//利用if-else语句来间隔输出标签和文本框
            if(i%2 == 0){//如果余数为0,则添加标签
                countPanel.add(labelList.get(j));
                j++;
            }else{//如果余数为1,则添加文本框
                countPanel.add(textFieldList.get(k));
                k++;
            }
        }
        rightResultlist = Deal.createRandom(arithmeticProblem,labelList,rightResultlist);             //调用创建随机题目的方法CreateRandom();
        allActionLIstener();        //调用按钮的动作监听方法myAddActionLIstener()
    }
    /**
     * 为按钮添加动作监听方法
     */
    public static void allActionLIstener() {
        //为清空按钮添加动作监听
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                for(JLabel clearlable : labelList){
                    clearlable.setText("");
                }
                for(JTextField cleartextField : textFieldList){
                    cleartextField.setText("");
                }
            }
        });
        //为重置按钮添加动作监听
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Deal.createRandom(arithmeticProblem,labelList,rightResultlist);
                for(JTextField cleartextField : textFieldList){
                    cleartextField.setText("");
                }
            }
        });
        //为打印按钮添加监听
        printfButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Integer i;
                Double result;
                rightNum = 0;
                //获取用户在文本框中输入的计算结果
                for(i = 0 ; i<textFieldList.size() ; i++){//用户输入计算结果的文本框集合
                    //Integer.parseInt()方法用于将字符串转换成数字
                    userList.add(Integer.parseInt(textFieldList.get(i).getText()));
                }
                //计算用户做对的题目个数
                for(i = 0 ; i<userList.size() ; i++){
                    if(userList.get(i) == rightResultlist.get(i)){//所有题目正确答案的集合
                        rightNum ++;//用户计算正确的个数
                    }
                }
                //计算用户做题的正确率
                result = ((rightNum * 1.0)/(labelList.size())*100);
                countLable.setText(result + "%");
            }
        });
    }
}