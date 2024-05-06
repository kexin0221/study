import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        for(i=100;i<=n;i++) {
            int ge=i%10;
            int bai=i/100;
            int shi=(i-bai*100)/10;
            if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i)
            {
                System.out.println(i);
            }
        }
    }
}
