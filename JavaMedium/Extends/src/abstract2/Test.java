package abstract2;

public class Test {
    public static void main(String[] args) {
        JavaEE e1 = new JavaEE();
        e1.setId(1);
        e1.setName("anmory");
        e1.work();
        Android e2 = new Android();
        e2.setId(2);
        e2.setName("陈琳");
        e2.work();
        Web e3 = new Web();
        e3.setId(3);
        e3.setName("周欢");
        e3.work();
        Hardware e4 = new Hardware();
        e4.setId(4);
        e4.setName("龚妍");
        e4.work();
    }
}
