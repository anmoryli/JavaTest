package test2;

public class Mouse implements USB{
    @Override
    public void open() {
        System.out.println("鼠标打开");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }

    // 特有功能
    public void move() {
        System.out.println("移动鼠标");
    }
}
