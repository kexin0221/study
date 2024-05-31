package IOperations;

import book.BookList;
import book.Book;

public class ShowOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("--显示图书--");

        int currentSize = bookList.getUseSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBooks(i);
            System.out.println(book);
        }
    }
}
