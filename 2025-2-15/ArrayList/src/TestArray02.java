import java.util.Scanner;

public class TestArray02 {

    public static int max(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

//        for(int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }

        for(int element : arr) {
            System.out.println(element);
        }

        System.out.println(max(arr));
    }
}
