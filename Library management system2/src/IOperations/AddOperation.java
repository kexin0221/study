package IOperations;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("--新增图书--");

        int currentSize = bookList.getUseSize();

        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要增加的图书:");
        String name = input.nextLine();
        System.out.println("请输入作者:");
        String author = input.nextLine();
        System.out.println("请输入价格:");
        int price = input.nextInt();
        System.out.println("请输入类型:");
        String type = input.nextLine();

        Book newbook = new Book(name,author,price,type);

        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBooks(i);
            if(book.getName().equals(name)){
                System.out.println("已经有这本书了!!");
                return;
            }
        }

        bookList.setBooks(currentSize,newbook);
        bookList.setUseSize(currentSize + 1);
        System.out.println("新增图书成功!!");
    }
}
