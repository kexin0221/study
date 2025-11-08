package ioperations;

import book.BookList;

//0.退出系统
public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("--退出系统--");
        System.exit(0);
    }
}
