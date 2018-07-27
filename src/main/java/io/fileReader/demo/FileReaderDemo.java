package io.fileReader.demo;

import sun.nio.cs.ext.GBK;

import java.io.*;

/**
 * 字符流
 *
 * @author Ecloss
 */
public class FileReaderDemo {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        //  转换流的子类 = 字节流 + 默认编码表
        FileReader fr = new FileReader("a.txt");
        //  转换流 = 字节流 + 编码表
        InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"), "GBK");


    }

}
