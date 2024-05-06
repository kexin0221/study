//在同一个类中定义多个方法：要求不仅可以求2个整数的最大值，还可以求3个小数的最大值
public class test {
    public static void main(String[] args) {
        int num1 = 1, num2 = 2;
        double num3 = 1.0,num4 = 2.0, num5 = 3.0;
        System.out.println(max(num1,num2));
        System.out.println(max(num3,num4,num5));
    }
    public static int max(int a,int b){
        return Math.max(a,b);
    }
    public static double max(double a,double b,double c){
        return Math.max(Math.max(a,b),c);
    }
}
