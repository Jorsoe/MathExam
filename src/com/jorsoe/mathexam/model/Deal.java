package com.jorsoe.mathexam.model;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Random;

/**
 * 数学处理
 * @auther Jorsoe
 * @date 2020/6/2 19:20
 */
public class Deal {
    /**
     * 随机创建算术题
     * @param arithmeticProblem 算术题对象
     * @param lableList 标签集合
     * @param rightResultList 结果集合
     * @return
     */
    public static List<Integer> createRandom(ArithmeticProblem arithmeticProblem, List<JLabel> lableList, List<Integer> rightResultList){
        //int a,b,cint;
        //String c = null;
        arithmeticProblem = new ArithmeticProblem();
        Random random = new Random();
        for(JLabel lable : lableList){         //list为题目(标签)集合,题目在标签中呈现
            arithmeticProblem.setOperatedNumber(random.nextInt(101));
            arithmeticProblem.setArithmeticNumber(random.nextInt(101));
            arithmeticProblem.setCint(random.nextInt(2));
            switch (arithmeticProblem.getCint()) {
                case 0:
                    arithmeticProblem.setOperator("+");
                    RandomRange(arithmeticProblem);//创建规定算数题范围函数,即和不大于100,差不小于0
                    lable.setText(arithmeticProblem.getOperatedNumber()+arithmeticProblem.getOperator()+arithmeticProblem.getArithmeticNumber());
                    lable.setBorder(BorderFactory.createLineBorder(Color.PINK));
                    rightResultList.add(arithmeticProblem.getOperatedNumber()+arithmeticProblem.getArithmeticNumber());//list2为所有题目正确答案的集合
                    break;
                default:
                    arithmeticProblem.setOperator("-");
                    RandomRange(arithmeticProblem);//创建规定算数题范围函数,即和不大于100,差不小于0
                    lable.setText(arithmeticProblem.getOperatedNumber()+arithmeticProblem.getOperator()+arithmeticProblem.getArithmeticNumber());
                    lable.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                    rightResultList.add(arithmeticProblem.getOperatedNumber()-arithmeticProblem.getArithmeticNumber());//list2为所有题目正确答案的集合
                    break;
            }
        }
        return rightResultList;
    }
    /**
     * 创建规定算数题范围函数,即和不大于100,差不小于0
     * @param arithmeticProblem 算术题对象
     */
    public static void RandomRange(ArithmeticProblem arithmeticProblem){
        Random r = new Random();
        switch (arithmeticProblem.getOperator()) {
            case "+":
                while(arithmeticProblem.getOperatedNumber()+arithmeticProblem.getArithmeticNumber()>100){
                    arithmeticProblem.setOperatedNumber(r.nextInt(101));
                    arithmeticProblem.setArithmeticNumber(r.nextInt(101));
                    if(arithmeticProblem.getOperatedNumber()+arithmeticProblem.getArithmeticNumber() <= 100){
                        break;
                    }
                }
                break;
            default:
                while(arithmeticProblem.getOperatedNumber()-arithmeticProblem.getArithmeticNumber()<0){
                    arithmeticProblem.setOperatedNumber(r.nextInt(101));
                    arithmeticProblem.setArithmeticNumber(r.nextInt(101));
                    if(arithmeticProblem.getOperatedNumber()-arithmeticProblem.getArithmeticNumber() >= 0){
                        break;
                    }
                }
                break;
        }
    }
}
