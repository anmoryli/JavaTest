package exception1;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        String s = "a.txlt";
        method(s);
    }

    public static void method(String s) throws FileNotFoundException{
        add(s);
    }

    public static void add(String s) throws FileNotFoundException {
        if (!s.endsWith(".txt")) {
            throw new FileNotFoundException("文件找不到");
        }
        System.out.println("我要执行了");
    }
}
