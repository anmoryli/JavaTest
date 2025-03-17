package thread3.thread2;

public class MyTicket implements Runnable{
    int ticket = 100;
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

//            method();
            method2();
        }
    }

    public synchronized void method() {
        if(ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "购买了第" + ticket + "张票");
            ticket--;
        }
    }

    public void method2() {
        synchronized (this) {
            System.out.println(this + "......");
            if(ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "购买了第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
