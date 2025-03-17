package test1;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    // 特有行为
    public void catchFish() {
        System.out.println("猫会抓鱼");
    }
}
