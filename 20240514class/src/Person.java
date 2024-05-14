public class Person {
    String name;
    String gender;
    int age;
    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    @Override
    public String toString() {
        return "[" + name + "," + gender + "," + age + "]";
    }
    public static void main(String[] args) {
        Person person = new Person("Jim","男", 18);
        System.out.println(person);
    }
}