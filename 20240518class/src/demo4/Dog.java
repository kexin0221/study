package demo4;

public class Dog extends Animal implements IRunning,ISwimming{
    public Dog(String name,int age){
        super(age, name);
    }
    public void eat(){
        System.out.println(this.name + " eat dog food");
    }
    public void bark(){
        System.out.println(this.name + "barking");
    }

    @Override
    public void run() {
        System.out.println(this.name + " is running");
    }

    @Override
    public void swim() {
        System.out.println(this.name + " is swimming");
    }
}
