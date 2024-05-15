package demo1;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "大黄";
        dog.age = 2;
        dog.eat();
        dog.bark();
        System.out.println("--------------------------");
        Cat cat = new Cat();
        cat.name = "小虎";
        cat.age = 2;
        cat.eat();
        cat.mimi();
    }
}
