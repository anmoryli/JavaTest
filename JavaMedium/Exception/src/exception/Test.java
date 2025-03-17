package exception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String username = "root";// 代表已经有一个叫root的用户了
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        if(name.equals(username)) System.out.println("登录成功");
        else {
            try {
                throw new LoginUserException("登录名错误或未注册");
            }catch(Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
    }
}
