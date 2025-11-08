package demo1;

public class Student implements Comparable<Student> {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Student{name='"+name+'\''+", age="+age+'}';
    }

    @Override
    public int compareTo(Student o){
        return Integer.compare(this.age,o.age);
    }
}
