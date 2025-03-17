package file1;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        String path = File.pathSeparator;
        String str = File.separator;

        System.out.println(path);
        System.out.println(str);
    }
}
