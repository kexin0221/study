import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count = 0;
        while(num != 0){
            count ++;
            num = num & (num - 1);
        }
        System.out.println(count);
    }
}
