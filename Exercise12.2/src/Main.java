import java.util.*;

public class Main {

    public void Solution() {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            try {
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                int sum = num1 + num2;
                System.out.println("sum = " + sum);
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input: two integer is required");
                in.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.Solution();
    }
}