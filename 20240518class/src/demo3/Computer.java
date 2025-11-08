package demo3;

public class Computer {
    public void open(){
        System.out.println("open the computer");
    }
    public void close(){
        System.out.println("close the computer");
    }
    public void useUSBDevice(USB usb){
        usb.openDevice();
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.click();
        }else{
            Keyboard keyboard = (Keyboard)usb;
            keyboard.input();
        }
        usb.closeDevice();
    }
}
