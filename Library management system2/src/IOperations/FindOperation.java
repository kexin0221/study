package IOperations;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("--查找图书--");
        
        int currentSize = bookList.getUseSize();

        System.out.println("请输入你要查找的图书:");
        Scanner input = new Scanner(System.in);
        String targetName = input.nextLine();
        
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBooks(i);
            if(book.getName().equals(targetName)){
                System.out.println("找到了:");
                System.out.println(book);
            }
            System.out.println("没有你要找的这本书!");
        }
    }
}
