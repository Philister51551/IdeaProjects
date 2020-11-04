package com.wangzhi.test;

public class RungeKutta extends BaseMethod {

    @Override
    public void process() {

        double k1,k2;
        for (int i=1;i<res.length;i++){
            k1=fun(var[i-1],res[i-1]);
            k2=fun(var[i-1]+h/2,res[i-1]+h/2*k1);
            res[i]=res[i-1]+h*k2;

        }
    }

    @Override
    public void printRes() {

        System.out.println("通过龙格库塔计算得出的结果为：");
        super.printRes();
    }
}
