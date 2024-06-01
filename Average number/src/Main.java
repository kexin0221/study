import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //write your code here......
        int count = 0;
        double avg = 0.0;
        while (scan.hasNext()){
            count ++;
            avg += (double)scan.nextInt()/count;
        }
        System.out.printf("%.2f%n",avg);
    }
}
