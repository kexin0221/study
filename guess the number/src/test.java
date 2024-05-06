import java.util.Scanner;
import java.util.Random;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        int key = ran.nextInt(100);
        while(true)
        {
            System.out.println("请输入一个整数（0~100）：");
            int num = input.nextInt();
            if(num<key){
                System.out.println("小了");
            }
            else if(num>key){
                System.out.println("大了");
            }
            else{
                System.out.println("猜对了");
                break;
            }
        }
    }
}
