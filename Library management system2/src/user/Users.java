package user;

import IOperations.*;
import book.BookList;

public abstract class Users {
    public String name;
    protected IOperation[] IOperations;

    public Users(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doIOperation(int choice, BookList bookList){
        IOperations[choice].work(bookList);
    }


}



