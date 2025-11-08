package ioperations;

import book.Book;
import book.BookList;

import java.util.Scanner;

//普通用户--2.借阅图书
public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("--借阅图书--");

        Scanner input = new Scanner(System.in);
        System.out.println("请输入你借阅的书名:");
        String name = input.nextLine();

        int currentSize = bookList.getUsedSize();

        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBooks(i);

            if(book.getName().equals(name)){
                if(book.isBorrowed()){
                    System.out.println("这本书已经被借出了");
                    return;
                }
                book.setBorrowed(true);
                System.out.println("借阅成功！");
                return;
            }
        }
        System.out.println("没有你要借阅的这本书");
    }
}
