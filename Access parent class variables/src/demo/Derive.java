package demo;

public class Derive extends Base{
    public int c = 30;
    public int a = 100;
    public void show(){
        System.out.println(super.a);
        System.out.println(this.a);
        System.out.println(b);
        System.out.println(c);
    }
}
