package com.wangzhi.test;

import java.math.BigDecimal;

public abstract class BaseMethod {
    public final double h=0.1;
    public double[] var=new double[11];
    public double[] res=new double[11];

    /*用抽象类的构造方法初始化两个数组的初始值*/
    public BaseMethod(){
        res[0]=1;
        double j=0;
        for (int i=0;i<var.length;i++){
            var[i]=j;
            BigDecimal x1=new BigDecimal(Double.toString(j));
            BigDecimal x2=new BigDecimal(Double.toString(h));
            j=x1.add(x2).doubleValue();
        }
    }

    /*从抽象类中给出初始函数*/
    public double fun(double x,double y){
        return (y-2*x/y);
    }

    /*定义抽象的过程处理函数*/
    public abstract void process();

    /*打印自变量*/
    public void printVar(){
        for (int i=0;i<var.length;i++){
            System.out.print("Var["+i+"]="+var[i]+" ");
        }
        System.out.print('\n');

    }

    /*打印因变量*/
    public void printRes(){
        for (int i=0;i<res.length;i++){
            System.out.print("res["+i+"]="+res[i]+" ");
        }
        System.out.print('\n');
    }

}
