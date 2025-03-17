package test2;

public class Keyboard implements USB{
    @Override
    public void open() {
        System.out.println("键盘连接");
    }

    @Override
    public void close() {
        System.out.println("键盘断开");
    }

    public void click() {
        System.out.println("敲击键盘");
    }
}
