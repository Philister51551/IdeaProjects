import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.SplittableRandom;

public class HW {
        public static void main(String[] args) throws IOException {
        /*for each循环的使用*/
/*        int[] a=new int[10];
        for (int i=0;i<a.length;i++){
            a[i]=i;
        }
            for (int i:a
                 ) {
                System.out.println(i);
            }*/



        Dog DD=new Dog(22,"eat");
        Cat cc=new Cat(33,"sleep");
/*
        System.out.println("猫"+Cat.getSize()+'\n');
        System.out.println("The result is:"+result);
*/
        //System.gc();


        /*通过bufferedreader读入单个字符*/
        BufferedReader br=new BufferedReader(new
                InputStreamReader(System.in));
/*        char ch1;
        System.out.println("请输入一串字符输入q结束！");
        do {
            ch1=(char)br.read();
            System.out.println(ch1);

        }while(ch1!='q');*/

        /*通过bufferedreader读入一组字符串*/
/*        String str2;
        System.out.println("输入一组字符串，输入end结束！");
        do {
            str2=br.readLine();
            System.out.println(str2);

        }while (!str2.equals("end"));*/


        Scanner sc=new Scanner(System.in);
/*        System.out.println("next方式接收：");
        if (sc.hasNext()){
            String str3=sc.next();
            System.out.println("输入的数据为："+str3);
        }*/
        /*用scanner类输入int类数据*/
/*
        System.out.println("nextline方式接收：");
        if (sc.hasNextInt()){
            System.out.println("输入的整形数据为："+sc.nextInt());
        }else {
            System.out.println("输入的数据不是整形数据");

        }
        sc.close();
*/

        /*判断是不是属于一个类*/
        boolean result=cc instanceof Cat;


        /*可变的String类型stringbuffer类型的使用*/
        StringBuffer sBuffer=new StringBuffer("You");
        sBuffer.append(" have");
        sBuffer.append(" my");
        sBuffer.append(" world.");
        sBuffer.reverse();
        //System.out.println(sBuffer.capacity());

        /*数组的声明和创建*/
        double[] mylist;
        mylist=new double[5];
        /*声明数组并创建*/
        double[] my=new double[5];
        for (int i=0;i<my.length;i++){
            my[i]=i;
            //System.out.println(my[i]);
        }

        /*声明的时候直接创建并且赋值*/
        double[] you={22,11,55,33,44};
        for (int i=0;i<you.length;i++){
            //System.out.println(you[i]);
        }
        Arrays.sort(you);
        /*for_each循环*/
        for(double y:you){
            //System.out.println(y);
        }
        //System.out.println(Arrays.binarySearch(you,22));

        /*匿名对象，输出当前时间*/
        /*输出时间的相关类还有：Calender,GregorianCalendar*/
        //System.out.println(new Date().toString());
        //System.out.printf("%tc%n",new Date());    %n与\n均可
        //SimpleDateFormat格式化日期


        /*printf格式输出函数*/
        float x=1.2f;
        int y=6;
        String str1="god";
       //System.out.printf("浮点型变量的值为 " +"%f, 整型变量的值为 " +" %d, 字符串变量的值为 " +"is %s", x, y, str1);*/


        /*常用的string类型的函数*/
        String fs;
        fs="hello world!";
        //System.out.println(fs.charAt(3));
        //System.out.println("字符串的长度为"+str.length());
        //System.out.println(str.concat("！！！"));


        /*单个字符进行操作*/
        Character ch=new Character('a');
        //System.out.println(ch.charValue());*/



        /*switch_case的使用*/
        String str="good!";
        switch (str)
        {
            case "hello":
                System.out.println(str+"NO1");
                break;
            case "world":
                System.out.println(str+"NO2");
                break;
            case "good":
                System.out.println(str+"NO3");
                break;
            default:
                break;
        }

        /* try catch捕获语句中的异常*/
/*        int a1,a2;
        a1=15;
        a2=0;
        try {
            System.out.println(a1/a2);
        }catch (ArithmeticException e){
            System.out.println("Exception thrown :"+e);
        }*/

        /*throws捕获方法的异常*/
        //System.out.println(test(11,0));
















        /*java日期时间*/
        /*java正则表达式*/
        /*java文件流*/
        /*java自定义异常*/


    }
    public static int test(int a, int b) throws ArithmeticException{
        int c=1;
        c=a/b;
        return c;



    }




}






























































































