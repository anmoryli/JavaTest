package test2;

public class Test {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.start();
        Mouse mouse = new Mouse();
        laptop.useUSB(mouse);
        Keyboard keyboard = new Keyboard();
        laptop.useUSB(keyboard);
        laptop.off();
    }
}
