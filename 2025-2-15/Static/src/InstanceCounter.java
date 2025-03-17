public class InstanceCounter {
    static int count;

    public int getCount() {
        return count;
    }
    public void addCount() {
        count++;
    }


    public InstanceCounter() {
        addCount();
    }
}
