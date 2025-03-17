public class Test {
    public static void main(String[] args) {
        sum(1,2,3,4);
    }

    public static void sum(int...arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
