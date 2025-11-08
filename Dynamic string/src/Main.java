import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        //write your code here......
        StringBuilder newStr = new StringBuilder(str);
        for(int i = str.length() - 3; i >= 0; i -= 3) {
            newStr.insert(i,',');
        }
        System.out.println(newStr.toString());
    }
}
