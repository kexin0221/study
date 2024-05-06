import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int i=1;
        int ret=1;
        while(i<=10)
        {
            ret+=i;
            System.out.print(i++);
        }
        System.out.println("\n"+ret);
        System.out.println(num);
    }
}
