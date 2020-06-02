package com.jorsoe.mathexam.model;

/**
 * @auther Jorsoe
 * @date 2020/5/14 18:46
 */
public class ArithmeticProblem {

    private int operatedNumber;         //被运算数
    private int arithmeticNumber;       //运算数
    private int cint;                   //运算符数字
    private String operator;           //运算符

    public ArithmeticProblem() {        //无参构造函数
    }
    /**
     * 全参构造函数
     * @param operatedNumber
     * @param arithmeticNumber
     * @param cint
     * @param operator
     */
    public ArithmeticProblem(int operatedNumber, int arithmeticNumber, int cint, String operator) {
        this.operatedNumber = operatedNumber;
        this.arithmeticNumber = arithmeticNumber;
        this.cint = cint;
        this.operator = operator;
    }

    public int getOperatedNumber() {
        return operatedNumber;
    }

    public void setOperatedNumber(int operatedNumber) {
        this.operatedNumber = operatedNumber;
    }

    public int getArithmeticNumber() {
        return arithmeticNumber;
    }

    public void setArithmeticNumber(int arithmeticNumber) {
        this.arithmeticNumber = arithmeticNumber;
    }

    public int getCint() {
        return cint;
    }

    public void setCint(int cint) {
        this.cint = cint;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
