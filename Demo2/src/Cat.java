public class Cat extends Dog{
    static int size=6;
    private int scope=666666;

    public Cat(int age, String behavior) {
        super(age, behavior);
    }

    public static int getSize() {
        return size;
    }

    public int getScope() {
        return scope;
    }

    void print(){
        System.out.println(size);
    }



//    protected void finalize() throws Throwable {
//        super.finalize();
//        System.out.println("The object is disposed!");
//    }
}
