
class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}
public class Test {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 5; i < 100; i++) {
            if(i%2==0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
