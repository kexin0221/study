package demo4;

public class Test {
    public static void main(String[] args) {
        func1(new Duck(8,"Donald Duck"));
        func1(new Dog("WangWang",2));
        func1(new Fish("JinLi",30));
    }
    public static void func1(Animal animal){
        animal.eat();
    }
}
