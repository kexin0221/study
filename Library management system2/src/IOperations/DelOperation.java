package IOperations;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("--删除图书--");
        int currentSize = bookList.getUseSize();

        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要删除的书:");
        String name = input.nextLine();

        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBooks(i);
            if(book.getName().equals(name)){
                
            }
        }
    }
}
