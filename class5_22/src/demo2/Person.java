package demo2;

public class Person implements Cloneable{
    public int age;
    public String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", name='" +
                name + '\'' + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
