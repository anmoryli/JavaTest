package test1;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗会啃骨头");
    }

    // 特有行为
    public void lookDoor() {
        System.out.println("狗会看门");
    }
}
