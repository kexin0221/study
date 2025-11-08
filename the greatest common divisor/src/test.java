import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int i=0;
        for(i=Math.min(m,n);i>=2;i--)
        {
            if(m%i==0&&n%i==0)
            {
                break;
            }
        }
        System.out.println(i);
    }
}
