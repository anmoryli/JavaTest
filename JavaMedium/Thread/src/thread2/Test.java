package thread2;

public class Test {
    public static void main(String[] args) {
        MyTicket myTicket = new MyTicket();

        Thread t1 = new Thread(myTicket,"anmory");
        Thread t2 = new Thread(myTicket,"陈琳");
        Thread t3 = new Thread(myTicket,"周欢");

        t1.start();
        t2.start();
        t3.start();
    }
}
