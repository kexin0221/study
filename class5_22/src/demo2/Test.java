package demo2;

public class Test {
    public static void main(String[] args)
            throws CloneNotSupportedException {
        Person person1 = new Person("zhangsan",
                10);
        //clone
        Person person2 = (Person) person1.clone();

        System.out.println(person2.name+' '+person2.age);
    }
}
