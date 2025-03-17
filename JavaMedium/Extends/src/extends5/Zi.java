package extends5;

public class Zi extends Fu{
    int num = 100;
    public Zi() {
        System.out.println("我是子类的无参构造方法");
    }

    public Zi(int i) {
        System.out.println("我是子类的有参构造方法");
    }

    public void method() {
        super.method();// 调用父类的method方法
        System.out.println(num);
        System.out.println(super.num);// 调用父类的num
    }
}
