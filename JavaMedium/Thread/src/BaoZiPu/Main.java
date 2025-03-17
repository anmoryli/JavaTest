package BaoZiPu;

public class Main {
    public static void main(String[] args) {
        BaoZiPu baoZiPu = new BaoZiPu();
        Producter producter = new Producter(baoZiPu);
        Consumer consumer = new Consumer(baoZiPu);

        Thread t1 = new Thread(producter);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }
}
