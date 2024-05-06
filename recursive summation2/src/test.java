import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(sum(num));
    }
    public static int sum(int n){
        if(n<10)
            return n;
        return n%10+sum(n/10);
    }
}
