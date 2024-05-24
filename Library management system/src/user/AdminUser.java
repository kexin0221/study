package user;

import java.util.Scanner;

public class AdminUser extends User{
    public AdminUser(String name){
        super(name);
    }

    public void menu(){
        System.out.println("*******管理员菜单*******");
        System.out.println("      1.查找图书");
        System.out.println("      2.新增图书");
        System.out.println("      3.删除图书");
        System.out.println("      4.显示图书");
        System.out.println("      0.退出系统");
        System.out.println("**********************");

        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的操作：");
        int choice = input.nextInt();
    }
}
