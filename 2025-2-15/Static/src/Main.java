public class Main {
    public static void main(String[] args) {
        System.out.println("Starting from: " + InstanceCounter.count);

        for(int i = 0; i < 500; i++) {
            new InstanceCounter();
        }

        System.out.println("Ending with count: " + InstanceCounter.count);
    }
}
