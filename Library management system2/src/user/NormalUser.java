package user;

import IOperations.*;

import java.util.Scanner;

public class NormalUser extends Users{
    public NormalUser(String name) {
        super(name);
        this.IOperations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    public int menu(){
        System.out.println("********普通用户菜单********");
        System.out.println("        1.查找图书");
        System.out.println("        2.借阅图书");
        System.out.println("        3.归还图书");
        System.out.println("        0.退出系统");
        System.out.println("************************");

        Scanner input = new Scanner(System.in);
        System.out.println("请选择你的操作:");
        return input.nextInt();
    }
}
