package BaoZiPu;

public class Producter implements Runnable{
    public Producter(BaoZiPu t) {
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
                if(baoZiPu.isFlag() == true) {
                    try {
                        baoZiPu.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                baoZiPu.setCount();
                baoZiPu.setFlag(true);
                baoZiPu.notify();
            }
        }
    }
}
