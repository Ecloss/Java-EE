package io.fileoutputstream.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 复习OutputStream
 *
 * @author 余修文
 * @date 2018/12/25 21:52
 */
public class FileOutputStreamDemo03 {

    public static void main(String[] args) throws IOException {
        /** 1. 定义要输出的文件的路径 */
        File file = new File("E:\\003_Code\\JAVA\\Java-EE\\src\\main\\file\\FileText03.txt");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }

        /** 2. 使用FileOutputStream 对OutputStream 进行实例化 */
        OutputStream outputStream = new FileOutputStream(file);

        /** 3. 进行文件的输出 */
        String str = "我要好好工作！";
        /** 将字符串变成字节数组  */
        byte[] bytes = str.getBytes();
        outputStream.write(bytes);

        /** 释放资源 */
        outputStream.close();
    }

}
