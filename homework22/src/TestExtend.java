public class TestExtend {
    public static void main(String[] args) {
        Dog dog = new Dog();

        System.out.println(dog.name);
        System.out.println(dog.age);

        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
