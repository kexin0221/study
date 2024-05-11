package NowCoder;

public class test {
    public int aMethod(){
        static int i = 0;
        i++;
        return i;
    }
    public static void main(String args[]){
        test test = new test();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }
}