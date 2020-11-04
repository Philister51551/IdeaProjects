package com.wangzhi.test;

public class Euler extends BaseMethod {

    @Override
    public void process() {
        for (int i=1;i<res.length;i++){
            res[i]=res[i-1]+h*fun(var[i-1],res[i-1]);
        }
    }

    @Override
    public void printRes() {
        System.out.println("通过欧拉方法计算得出的结果为：");
        super.printRes();
    }
}
