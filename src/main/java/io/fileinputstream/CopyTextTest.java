package io.fileinputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 复制一个文件：
 * 读取文件数据，将数据写到目的中。用到了流，操作设备上的数据
 *
 * @author Ecloss
 */
public class CopyTextTest {

    public static void main(String[] args) throws IOException {

        copyText();

    }

    public static void copyText() throws IOException {

        //  1. 创建一个输入流和源数据相关联
        FileInputStream fis = new FileInputStream("F:\\Workspace\\file\\002.txt");

        //  2. 创建一个输出流，并通过输出流创建一个目的
        FileOutputStream fos = new FileOutputStream("F:\\Workspace\\file\\003.txt");

        //  读一个，写一个 -->
        int by = 0;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fos.close();
        fis.close();

    }

}
