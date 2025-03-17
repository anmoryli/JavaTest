package thread2;

public class MyTicket implements Runnable{
    int ticket = 100;
    // 任意new一个对象
    Object object = new Object();
    @Override
    public void run() {
        while(true) {
            synchronized (object) {
                if(ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "购买了第" + ticket + "张票");
                    ticket--;
                }
            }
        }
    }
}
