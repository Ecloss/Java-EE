package io.bufferedoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 用字节流操作中文数据
 *
 * @author Ecloss
 */
public class ReadCNDemo {

    public static void main(String[] args) throws IOException {

        writeCNText();

    }

    public static void writeCNText() throws IOException {
        FileOutputStream fos = new FileOutputStream("F:\\Workspace\\file\\cn_copy.txt");
        FileInputStream fis = new FileInputStream("F:\\Workspace\\file\\cn.txt");

        byte[] buf = new byte[1024];
        int len = 0;
        len = fis.read(buf);
        String s = new String(buf, 0, len);
        System.out.println(s);

        fis.close();
    }

}
