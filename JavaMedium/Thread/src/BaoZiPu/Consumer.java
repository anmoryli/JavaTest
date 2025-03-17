package BaoZiPu;

public class Consumer implements Runnable{
    public Consumer(BaoZiPu t) {
        this.baoZiPu = t;
    }

    BaoZiPu baoZiPu = new BaoZiPu();
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (baoZiPu) {
                if(baoZiPu.isFlag() == false) {
                    try {
                        baoZiPu.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                baoZiPu.getCount();
                baoZiPu.setFlag(false);
                baoZiPu.notify();
            }
        }
    }
}
