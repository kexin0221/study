package demo4;

public abstract class Animal {
    public String name;
    public int age;
    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract void eat();
}
