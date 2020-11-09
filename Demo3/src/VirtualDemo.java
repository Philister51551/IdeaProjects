/* 文件名 : VirtualDemo.java */
public class VirtualDemo {
    public static void main(String [] args) {
        Salary s = new Salary("员工 A", "北京", 3, 3600.00);
        Employee e = new Salary("员工 B", "上海", 2, 2400.00);
        //e可以调用的方法和属性只限于Employee中已有的，没有的不能调用
        //多态调用的成员方法以及构造函数都是new后面的类的，比如重写的构造函数或者方法
        System.out.println("使用 Salary 的引用调用 mailCheck -- ");
        s.mailCheck();
        System.out.println("\n使用 Employee 的引用调用 mailCheck--");
        e.mailCheck();
        s.test();
        //e.test();
        //System.out.println(s.salary);



    }
}