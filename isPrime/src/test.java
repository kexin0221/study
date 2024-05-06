import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=0;
        for(i=2;i<num;i++)
        {
            if(num%i==0)
            {
                System.out.println("不是素数");
                break;
            }

        }
        if(num==i)
        {
            System.out.println("是素数");
        }

    }
}
