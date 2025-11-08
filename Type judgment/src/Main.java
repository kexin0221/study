import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String className = scanner.next();
            Base obj = (Base) Class.forName(className).newInstance();
            System.out.println(getClassName(obj));
        }
    }

    public static String getClassName(Base obj) {

        //write your code here......
        if(obj instanceof Sub1){
            Sub1 sub1 = (Sub1) obj;
            return sub1.getClass().getSimpleName();
        }else if(obj instanceof Sub2){
            Sub2 sub2 = (Sub2) obj;
            return sub2.getClass().getSimpleName();
        }else{
            return obj.getClass().getSimpleName();
        }

    }

}

class Base {

}

class Sub1 extends Base {

}

class Sub2 extends Base {

}