public class cat extends Animal {
    private int high=10;
    public cat(int high){
        super(high);
    }
    void print(){
        System.out.println(high);
    }
    void move(){
        super.move();
        System.out.println(" 猫可以移动！");
    }
    void bark(){
        System.out.println("猫可以叫！");
    }
}
