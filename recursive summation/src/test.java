public class test {
    public static void main(String[] args) {
        int ret = sum(5);
        System.out.println(ret);
    }

    public static int sum(int n) {
        if (n==1)  return 1;
        int s = n + sum(n-1);
        return s;
    }
}
