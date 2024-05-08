public class test {
    public static void main(String[] args) {
        String s = "123";
        char[] a ={'1','2'};
        myinteger.MyInteger i1 = new myinteger.MyInteger(3);
        myinteger.MyInteger i2 =new myinteger.MyInteger(4);
        System.out.println(i1.isEven());
        System.out.println(i1.isOdd());
        System.out.println(i1.isPrime());
        System.out.println(i1.isPrime(i2));
        System.out.println(i1.isEven(i2));
        System.out.println(i1.isOdd(i2));
        System.out.println(i1.equals(5));
        System.out.println(i1.equals(i2));
        System.out.println(myinteger.MyInteger.parseInt(s));
        System.out.println(myinteger.MyInteger.parseInt(a));
    }
}
