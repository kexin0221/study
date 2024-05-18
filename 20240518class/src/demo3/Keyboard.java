package demo3;

public class Keyboard implements USB{
    @Override
    public void openDevice() {
        System.out.println("open the keyboard");
    }

    @Override
    public void closeDevice() {
        System.out.println("close the keyboard");
    }
    public void input(){
        System.out.println("input something");
    }
}
