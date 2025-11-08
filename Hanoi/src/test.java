import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        hanoi(n,'a','b','c');
    }

    public static void move(int x,int y){
        System.out.printf("%c->%c\n", x, y);
    }
    public static void hanoi(int n,char a,char b,char c){
        if(n==1){
            move(a,c);
        }
        else{
            hanoi(n-1,a,c,b);
            move(a,c);
            hanoi(n-1,b,a,c);
        }
    }
}
