import java.util.Scanner;

public class Main {
    private static final String name = "user";
    private static final String password = "123456";


    public static void main(String[] args) throws PasswordException,NameException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = scanner.next();
        System.out.println("请输入密码：");
        String password = scanner.next();
        login(name,password);

    }
    public static void login(String name,String password) throws PasswordException,NameException{
        if (!Main.name.equals(name)) {
            throw new NameException("用户名错误");
        }
        if (!Main.password.equals(password)) {
            throw new PasswordException("密码错误");

        }
        System.out.println("登录成功!");
    }

}


