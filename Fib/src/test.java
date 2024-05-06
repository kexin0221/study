import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(Fib(num));
    }
    public static int Fib(int n){
        if(n==1||n==2){
            return 1;
        }
        return Fib(n-1)+Fib(n-2);
    }
}
