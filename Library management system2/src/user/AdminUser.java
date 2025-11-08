package user;

import IOperations.*;

import java.util.Scanner;

public class AdminUser extends Users{
    public AdminUser(String name) {
        super(name);
        this.IOperations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new ShowOperation()
        };
    }

    public int menu(){
        System.out.println("********管理员菜单********");
        System.out.println("        1.查找图书");
        System.out.println("        2.新增图书");
        System.out.println("        3.删除图书");
        System.out.println("        4.显示图书");
        System.out.println("        0.退出系统");
        System.out.println("************************");

        Scanner input = new Scanner(System.in);
        System.out.println("请选择你的操作:");
        return input.nextInt();
    }
}
