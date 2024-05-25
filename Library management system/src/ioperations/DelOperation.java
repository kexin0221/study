package ioperations;

import book.Book;
import book.BookList;

import java.util.Scanner;

//管理员--3.删除图书
public class DelOperation implements IOperation {
    public void work(BookList bookList) {
        System.out.println("--删除图书--");

        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要删除的书名:");
        String name = input.nextLine();

        int currentSize = bookList.getUsedSize();

        int pos = -1;

        //找到这本书
        int i = 0;
        for (i = 0; i < currentSize; i++) {
            Book book = bookList.getBooks(i);
            if(book.getName().equals(name)){
                pos = i;
                break;
            }
        }

        if(i == currentSize){
            System.out.println("没有你要删除的书！");
            return;
        }

        //开始删除
        for (int j = pos; j < currentSize - 1; j++) {
            //bookList[j] = bookList[j+1];
            Book book = bookList.getBooks(j + 1);
            bookList.setBooks(j, book);
        }

        bookList.setUsedSize(currentSize - 1);
        System.out.println("删除成功！");
    }
}
