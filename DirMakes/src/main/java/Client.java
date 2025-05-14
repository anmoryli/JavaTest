/**
 * @author Anmory
 * @description TODO
 * @date 2025-05-14 下午3:28
 */

public class Client {
    public static void main(String[] args) {
        Plate plate1 = new Plate("盘子1");
        Plate plate2 = new Plate("盘子2");

        Component apple1 = new Apple("苹果1");
        Component apple2 = new Apple("苹果2");
        Component pear1 = new Pear("梨1");
        Component pear2 = new Pear("梨2");
        Component banana1 = new Banana("香蕉1");
        Component banana2 = new Banana("香蕉2");
        Component banana3 = new Banana("香蕉3");

        plate1.add(apple1);
        plate1.add(pear1);
        plate1.add(banana1);

        plate2.add(apple2);
        plate2.add(pear2);
        plate2.add(banana2);
        plate2.add(banana3);

        plate1.eat();
        plate2.eat();
    }
}
