public class Test {
    public static void main(String[] args) {
        int[] arr = new int[4];
        for(int i = 0; i < 4; i++) {
            arr[i] = i;
        }
        method(arr);
    }

    private static void method(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
