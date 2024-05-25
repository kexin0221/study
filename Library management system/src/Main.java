import book.BookList;
import ioperations.IOperation;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {

    public static User login(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的姓名 ：");
        String name = input.nextLine();

        System.out.println("请输入你的身份:1.管理员  2.普通用户");
        int choice = input.nextInt();

        if(choice == 1){
            return new AdminUser(name);
        }else{
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();

        System.out.println("欢迎"+user.name+"来到图书系统!!!");
        while (true) {
            int choice = user.menu();
            /*
             * 要根据这个返回值来看调用哪个对象的哪个方法
             *
             * 1.哪个对象
             *   已经做了：User user = login();
             * 2.哪个方法
             *   2.1 确定当前对象已经包含了哪些方法
             *       在调用子类对象的时候，构造方法会初始化好
             *       对应的操作对象
             *   2.2 怎么具体调用
             * */

            user.doIoperation(choice, bookList);
        }
    }
}

/*
* 后续扩展：
* 1.每次运行程序，上次运行的结果就没有了，所以想存储数据，有以下几个思路：
*   1.1 换成文件，存储到文件当中（在磁盘上了）<I/O>
*   1.2 换成数据库MySQL
* 2.后续讲完EE进阶，可以实现为web端的一个小练习
*   2.1 加入网页
*   2.2 加入框架
* 3.功能上进行扩展
*
* */
