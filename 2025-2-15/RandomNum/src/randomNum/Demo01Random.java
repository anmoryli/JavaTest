package randomNum;

import java.util.Random;
import java.util.Scanner;

public class Demo01Random {
    public static void main(String[] args) {
        Random random = new Random();
        int ans = random.nextInt(100) + 1;// 在1 - 100之间随机一个数

        Scanner sc = new Scanner(System.in);

        int chance = 3;
        while(true) {
            if(chance == 0) {
                System.out.println("机会用完了,这个数是：" + ans);
                break;
            }
            System.out.println("请猜一个数(还有" + chance + "次机会):");
            int guess = sc.nextInt();
            if(guess > ans) {
                System.out.println("大了");
                chance--;
            }
            else if (guess<ans) {
                System.out.println("小了");
                chance--;
            }
            else {
                System.out.println("正确,这个数是" + ans);
                break;
            }
        }

    }
}
