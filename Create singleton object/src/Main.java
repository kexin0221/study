public class Main {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }

}

class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    //write your code here......


    public static Singleton getInstance() {
        return instance;
    }
}
