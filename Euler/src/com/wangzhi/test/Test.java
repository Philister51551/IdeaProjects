package com.wangzhi.test;

public class Test {
    public static void main(String[] args){
        Exact exact=new Exact();
        exact.process();
        exact.printVar();
        exact.printRes();
        Euler euler=new Euler();
        euler.process();
//        euler.printRes();
        /*隐式欧拉使用递归和循环均可完成*/
        ImpEuler impEuler=new ImpEuler();
        impEuler.process();
        //impEuler.printRes();
        /*梯形公式计算结果*/
        TraEuler traEuler=new TraEuler();
        traEuler.process(euler,impEuler);
        traEuler.printRes();
//        ModEuler modEuler=new ModEuler();
//        modEuler.process();
//        modEuler.printRes();
//        RungeKutta rungeKutta=new RungeKutta();
//        rungeKutta.process();
//        rungeKutta.printRes();

    }
}
