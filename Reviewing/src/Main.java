import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int a = input.nextInt();
       int b = input.nextInt();

       try{
           System.out.println(a/b);
       }catch(ArithmeticException e){
           System.out.println("ArithmeticException异常");
       }
    }
}
