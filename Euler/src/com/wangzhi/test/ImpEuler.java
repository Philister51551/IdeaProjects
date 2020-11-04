package com.wangzhi.test;

public class ImpEuler extends Euler{

    public void process() {
        super.process();
        double[] res1=new double[11];
        res1=res;
        for (int i=1;i<res.length;i++){
            res[i]=impEulerDetail(var[i],res1[i],res[i-1],h);
        }
    }

    double impEulerDetail(double x1,double y1,double y,double h)
    {
        double temp1=y1,temp2;
        temp2=y+h*(fun(x1,y1));
        //System.out.println(temp2);
        while(Math.abs(temp1-temp2)>1e-6)
        {
            temp1=temp2;
            temp2=y+h*(fun(x1,temp2));
        }
        return temp2;

        /*递归*/
/*        double fin=y+h*(fun(x1,y1));
        if(Math.abs(y1-fin)<=1e-6)
        {
            return fin;
        }
	    else
	        return impEulerDetail(x1,fin,y,h);*/

    }

    @Override
    public void printRes() {
        System.out.println("通过隐式欧拉计算得出的结果为：");
        for (int i=0;i<res.length;i++){
            System.out.print("res["+i+"]="+res[i]+" ");
        }
        System.out.print('\n');
    }
}