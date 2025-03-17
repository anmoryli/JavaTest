import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];

        // 从键盘读入数据
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < size; i++) {
            int val = sc.nextInt();
            arr[i] = val;
        }

        // 输出数组
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
