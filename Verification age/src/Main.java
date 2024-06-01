import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person p = new Person();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            p.setAge(age);
            System.out.println(p.getAge());
        }
    }

}

class Person {

    private int age;

    //write your code here......


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=200){
            this.age = 200;
        }else if(age<=0){
            this.age = 0;
        }else{
            this.age = age;
        }
    }
}