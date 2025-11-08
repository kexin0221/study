package demo3;

public class Mouse implements USB{
    @Override
    public void openDevice() {
        System.out.println("open the mouse");
    }

    @Override
    public void closeDevice() {
        System.out.println("close the mouse");
    }
    public void click(){
        System.out.println("click the mouse");
    }
}
