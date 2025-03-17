public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a = " + a + ", b = " + b);
        swap1(a,b);
        System.out.println("a = " + a + ", b = " + b);
        swap2(a,b);
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void swap1(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

    public static void swap2(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
