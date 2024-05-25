package ioperations;

import book.Book;
import book.BookList;

import java.util.Scanner;

//管理员--2.新增图书
public class AddOperations implements IOperation{
    public void work(BookList bookList){
        System.out.println("--新增图书--");

        //1.判满
        int currentSize = bookList.getUsedSize();
        if(currentSize == bookList.getBooks().length){
            System.out.println("书架满了");
        }

        //2.创建
        Scanner input = new Scanner(System.in);
        System.out.println("请输入书名:");
        String name = input.nextLine();

        System.out.println("请输入作者:");
        String author = input.nextLine();

        System.out.println("请输入价格:");
        int price = input.nextInt();

        System.out.println("请输入类型");
        String type = input.nextLine();

        Book newbook = new Book(name,author,price,type);

        //3.判断原书架有无这本书
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBooks(i);
            if(book.getName().equals(name)){
                System.out.println("已经有这本书了");
                return;
            }
        }

        //4.插入这本书
        bookList.setBooks(currentSize,newbook);
        bookList.setUsedSize(currentSize + 1);
        System.out.println("新增图书成功！");
    }
}
