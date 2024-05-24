package user;

public class User {
    protected String name;

    //此时这里为了子类中帮我初始化父类的成员
    public User(String name){
        this.name = name;
    }
}
