package com.wangzhi.test;

public class Exact extends BaseMethod {

    @Override//重写父类的抽象方法
    public void process() {
        for (int i=1;i<res.length;i++){
            res[i]=Math.sqrt(1+2*var[i]);
        }
    }

    @Override
    public void printRes() {
        System.out.println("通过计算得出的精确结果为：");
        super.printRes();
    }
}
