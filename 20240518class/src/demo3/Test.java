package demo3;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.open();
        System.out.println();
        computer.useUSBDevice(new Mouse());
        System.out.println();
        computer.useUSBDevice(new Keyboard());
        System.out.println();
        computer.close();
    }
}
