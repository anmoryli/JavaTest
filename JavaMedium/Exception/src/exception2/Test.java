package exception2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws Exception{
        String s = "null.txlt";
        add(s);
        del();
    }

    public static void add(String s) throws Exception{
        if(s == null) {
            throw new IOException("IO异常");
        }

        if(!s.endsWith(".txt")) {
            throw new FileNotFoundException("文件找不到");
        }
        System.out.println("我要执行了");
    }

    public static void del() {
        System.out.println("删除功能");
    }
}
