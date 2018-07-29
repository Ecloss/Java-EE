package io.fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 字节输入流
 *
 * @author Ecloss
 */
public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException {

        // 为了确保文件一定在读之前是存在的，将字符串路径封装成FIle对象
        File file = new File("F:\\Workspace\\file\\002.txt  ");
        if (!file.exists()) {
            throw new RuntimeException("要读取的文件不存在");
        }

        //  创建文件字节读取流对象时，必须明确与之相关联的数据源
        FileInputStream fis = new FileInputStream(file);

        //  读流对象
        int by = 0;
        while ((by = fis.read()) != -1) {
            System.out.println(by);
        }

        //  关闭资源
        fis.close();

    }

}
