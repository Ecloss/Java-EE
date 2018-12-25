package io.fileoutputstream.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 测试输出流
 *
 * @author Ecloss
 */
public class FileOutputStreamDemo2 {

    public static void main(String[] args) throws IOException {

        File dir = new File("F:\\Workspace\\file");
        if (!dir.exists()) {
            dir.mkdir();
        }

        FileOutputStream fos = new FileOutputStream("F:\\Workspace\\file\\123.txt");

        String str = "qwerrtytyuioopqwettyuiop";
        byte[] bytes = str.getBytes();
        fos.write(bytes);

        fos.close();

    }

}
