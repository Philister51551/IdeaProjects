package com.wangzhi.test;

public class TraEuler extends BaseMethod {
    @Override
    public void process() {}

    public void process(Euler euler,ImpEuler impEuler) {
        for (int i=1;i<res.length;i++){
            res[i]=((euler.res[i]+impEuler.res[i]))/2;
        }
    }

    @Override
    public void printRes() {
        System.out.println("通过梯形公式计算得出的结果为：");
        super.printRes();
    }
}
