public class test {
    public static void main(String[] args) {
        double sum=0;
        double t=0;
        int a=1;
        int i=0;
        for(i=1;i<=100;i++)
        {
            t=1.0/i;
            sum+=a*t;
            a=-a;
        }
        System.out.println(sum);
    }
}
