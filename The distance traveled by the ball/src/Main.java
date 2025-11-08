import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float h=scanner.nextFloat();
        int n =scanner.nextInt();

        //write your code here......
        double sum = h;
        for (int i = 1; i < n; i++) {
            sum += h;
            h = h / 2;
        }
        h = h / 2;
        System.out.println(String.format("%.3f", h)+" "+String.format("%.3f", sum));
    }
}
