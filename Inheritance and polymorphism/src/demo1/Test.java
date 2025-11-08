package demo1;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "咪咪";
        cat.age = 18;
        cat.eat();
        System.out.println("------------");
        Dog dog = new Dog();
        dog.name = "旺柴";
        dog.age = 20;
        dog.eat();
    }
}
