package fileUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        // 创建一个socket对象
        Socket socket = new Socket("127.0.0.1",8080);
        // 创建一个file流读取图片
        FileInputStream fis = new FileInputStream("C:\\Users\\12901\\Downloads\\pexels-torbenb-3623114.png");
        // 调用getInputStream用于把图片写入服务端
        OutputStream os = socket.getOutputStream();
        // 边读边写
        byte[] bytes = new byte[1024];
        int len;
        while((len = fis.read(bytes)) != -1 ) {
            os.write(bytes, 0, len);
        }
        //给服务端写一个结束标记
        socket.shutdownOutput();
        System.out.println("======以下代码是读取响应的结果======");

        //5.调用getInputStream,读取响应结果
        InputStream is = socket.getInputStream();
        byte[] bytes1 = new byte[1024];
        int len1 = is.read(bytes1);
        System.out.println(new String(bytes1,0,len1));

        //6.关流
        is.close();
        os.close();
        fis.close();
        socket.close();
    }
}
