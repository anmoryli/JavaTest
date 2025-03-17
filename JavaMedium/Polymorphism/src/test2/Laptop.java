package test2;

public class Laptop {
    public void start() {
        System.out.println("电脑开机");
    }

    public void useUSB(USB usb) {
        if(usb instanceof Mouse) {
            Mouse mouse = new Mouse();
            mouse.open();
            mouse.move();
            mouse.close();
        }
        else {
            Keyboard keyboard = new Keyboard();
            keyboard.open();
            keyboard.click();
            keyboard.close();
        }
    }

    public void off() {
        System.out.println("电脑关机");

    }
}
