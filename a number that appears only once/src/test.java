import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        //输入一个数组
        System.out.println("请输入几个数并用逗号隔开：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toString();
        String[] arr = str.split(",");
        int[] a = new int[arr.length];
        System.out.println(SingleNumber(a));
    }
    public static int SingleNumber(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    break;
                } else if (j == arr.length - 1) {
                    result = arr[i];
                }
            }
        }
        return result;
    }
}

