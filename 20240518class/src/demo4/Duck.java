package demo4;

public class Duck extends Animal implements ISwimming,IRunning,IFlying{
    public Duck(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println(this.name + " is eating duck food");
    }

    @Override
    public void fly() {
        System.out.println(this.name + " is flying");
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
