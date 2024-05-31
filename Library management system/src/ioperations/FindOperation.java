package ioperations;

import book.Book;
import book.BookList;

import java.util.Scanner;

//管理员--1.查找图书
public class FindOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("--查找图书--");
        Scanner input = new Scanner(System.in);

        System.out.println("请输入你要查找的书名:");
        String name = input.nextLine();
        int currentSize = bookList.getUsedSize();

        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBooks(i);
            if(book.getName().equals(name)){
                System.out.print("找到了:");
                System.out.println(book);
                return;
            }
        }

        System.out.println("没有你要找的这本书！");
    }
}
