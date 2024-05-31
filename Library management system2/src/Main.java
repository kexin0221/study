import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.Users;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookList bookList = new BookList();

        Users user = login();

        System.out.println("欢迎"+user.name+"来到图书系统!!");
        while (true){
            int choice = user.menu();
            user.doIOperation(choice,bookList);
        }
    }

    public static Users login(){
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎来到图书管理系统！！");
        System.out.println("请输入你的姓名:");
        String name = input.nextLine();

        System.out.println("请选择你的身份:1.管理员 2.普通用户");
        int choice = input.nextInt();
        return (choice == 1)? new AdminUser(name):
                new NormalUser(name);
    }
}
