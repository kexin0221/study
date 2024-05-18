package demo2;

public interface IShape {
    public static final int a = 10;
    int b = 20;
    public abstract void draw();
    void draw1();
    default void test(){
        System.out.println("default方法");
    }
    static void test1(){
        System.out.println("static方法");
    }
}
