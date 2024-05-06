//在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法
public class test {
    public static void main(String[] args) {
        int num1 = 1, num2 = 2;
        double num3 = 1.0,num4 = 2.0, num5 = 3.0;
        System.out.println(add(num1,num2));
        System.out.println(add(num3,num4,num5));
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a,double b,double c){
        return a+b+c;
    }
}
