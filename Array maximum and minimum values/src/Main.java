import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] ary = new int[6];
        int max;
        int min;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <ary.length ; i++) {
            ary[i]=scanner.nextInt();
        }

        //write your code here......
        max = ary[0];
        min = ary[0];
        for (int i = 0; i < ary.length; i++) {
            if (max < ary[i]) {
                int tmp = max;
                max = ary[i];
                ary[i] = tmp;
            }
        }

        for (int i = 0; i < ary.length; i++) {
            if (min > ary[i]) {
                int tmp = min;
                min = ary[i];
                ary[i] = tmp;
            }
        }

        System.out.println(max+" "+min);
    }
}