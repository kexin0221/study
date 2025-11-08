package user;

import book.BookList;
import ioperations.*;

public abstract class User {
    public String name;
    protected IOperation[] iOperations;

    //此时这里为了子类中帮我初始化父类的成员
    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doIoperation(int choice, BookList bookList) {
        iOperations[choice].work(bookList);
    }
}
