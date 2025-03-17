package Scanner;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        int data = a.nextInt();
        String str = b.next();
        System.out.println(data + "\n");
        System.out.println(str + "\n");
    }
}
