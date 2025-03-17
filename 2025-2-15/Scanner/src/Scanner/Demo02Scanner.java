package Scanner;
import java.util.Scanner;

public class Demo02Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String d1 = sc.next();
        String d2 = sc.nextLine();

        System.out.println(d1);
        System.out.println(d2);
    }
}
