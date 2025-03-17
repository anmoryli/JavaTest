package interface2;

public interface USB {
    public default void method() {
        System.out.println("我是接口的默认方法");
    }

    public static void methodStc() {
        System.out.println("我是接口中的静态方法");
    }
}
