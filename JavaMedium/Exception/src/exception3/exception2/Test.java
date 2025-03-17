package exception3.exception2;

import java.io.FileNotFoundException;
import java.io.IOException;

//public class Test {
//    public static void main(String[] args) throws Exception{
//        String s = null;
//        try {
//            add(s);
//        }catch (Exception e) {
//            System.out.println(e);
//        }
//        del();
//    }
//
//    public static void add(String s) throws Exception{
//        if(s == null) {
//            throw new IOException("IO异常");
//        }
//
//        if(!s.endsWith(".txt")) {
//            throw new FileNotFoundException("文件找不到");
//        }
//        System.out.println("我要执行了");
//    }
//
//    public static void del() {
//        System.out.println("删除功能");
//    }
//}

public class Test {
    public static void main(String[] args) throws Exception{
        String s = null;
        try {
            add(s);
        }catch (FileNotFoundException e) {
            System.out.println(e);
        }catch (IOException e) {
            System.out.println(e);
        }finally {
            System.out.println("无论如何我必须执行");
        }
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
