package demo4;

public class Fish extends Animal implements ISwimming{
    public Fish(String name,int age){
        super(age, name);
    }
    public void eat(){
        System.out.println(this.name + " eat fish food");
    }

    @Override
    public void swim() {
        System.out.println(this.name + " is swimming");
    }
}
