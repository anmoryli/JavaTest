package interface1;

public class Test {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.open();
        mouse.close();

        String connect = mouse.connect();
        System.out.println(connect);
    }
}
