package ioperations;

import book.Book;
import book.BookList;

import java.util.Scanner;

//普通用户--3.归还图书
public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("--归还图书--");

        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要归还的书名:");
        String name = input.nextLine();

        int currentSize = bookList.getUsedSize();

        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBooks(i);

            if(book.getName().equals(name)){
                if(book.isBorrowed()){
                    book.setBorrowed(false);
                    System.out.println("归还成功！");
                    return;
                }
            }
        }
        System.out.println("没有你要归还的图书");
    }
}
