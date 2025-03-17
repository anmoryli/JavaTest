package thread1;

public class Test {
//    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        myThread.setName("anmory");
//        myThread.start();
//
//        for(int i = 0; i < 15; i++) {
//            Thread.sleep(1000L);
//            System.out.println(Thread.currentThread().getName() + "线程执行了 " + i + 1);
//        }
//    }
public static void main(String[] args) {
    MyThread t1 = new MyThread();
    t1.setName("金莲");

    MyThread t2 = new MyThread();
    t2.setName("阿庆");

        /*
           获取两个线程的优先级
           MIN_PRIORITY = 1 最小优先级 1
           NORM_PRIORITY = 5 默认优先级 5
           MAX_PRIORITY = 10 最大优先级 10
         */
    //System.out.println(t1.getPriority());
    //System.out.println(t2.getPriority());

    //设置优先级
    t1.setPriority(1);
    t2.setPriority(10);

    t1.start();
    t2.start();
}
}
