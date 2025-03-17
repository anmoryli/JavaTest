package BaoZiPu;

public class BaoZiPu {
    private int count;
    private boolean flag;

    public BaoZiPu() {
    }

    public BaoZiPu(int count, boolean flag) {
        this.count = count;
        this.flag = flag;
    }

    public void getCount() {
        System.out.println("消费了...........第" + count + "个包子");
    }

    public void setCount() {
        count++;
        System.out.println("生产了...第" + count + "个包子");
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
