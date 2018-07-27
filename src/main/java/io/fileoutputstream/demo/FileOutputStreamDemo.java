package io.fileoutputstream.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节输出流
 * FileoutputStream:文件输出流是用于将数据写入File或FileDescriptor的输出流。
 * 注意处理IO异常。续写和换行。
 *
 * @author Ecloss
 */
public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {

        /**
         * 将数据写入到文件中
         * 使用字节输出流
         * FileOutputStream
         */
        File dir = new File("F:\\Workspace\\file");
        //  exists : 查看文件存在
        if (!dir.exists()) {
            dir.mkdir();
        }

        //  1. 创建字节输出流对象，用于操作文件，在对象初始化时，必须明确数据存储的目的地
        //  输出流所关联的目的地，如果不存在，会自动创建。如果床架，则替换并覆盖
        FileOutputStream fos = new FileOutputStream("F:\\Workspace\\file\\fos.txt");

        //  2. 调用输出流的写功能
        String str = "abcde";
        byte[] buf = str.getBytes();
        fos.write(buf);

        //  3. 释放资源
        fos.close();

    }

}
