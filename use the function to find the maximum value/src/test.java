//创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
//要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
public class test {
    public static void main(String[] args) {
        int a=1,b=2,c=3;
        System.out.println(max3(a,b,c));
    }
    public static int max2(int m,int n){
        return (Math.max(m, n));
    }

    public static int max3(int a,int b,int c){
        return max2(max2(a,b),c);
    }
}
