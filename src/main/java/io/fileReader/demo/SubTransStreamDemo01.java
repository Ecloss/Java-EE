package io.fileReader.demo;

import java.io.*;

/**
 * 编码转换
 *
 * @author Ecloss
 */
public class SubTransStreamDemo01 {

    public static void main(String[] args) throws IOException {

        readText();

    }

    /**
     * 写方法 FileWrite
     */
    public static void writeText() throws IOException {

        //  1. 创建一个用于操作稳健的字符输出流对象
        FileWriter fw = new FileWriter("F:\\Workspace\\file\\cn.txt");
        //  等效于
        //FileOutputStream fos = new FileOutputStream("F:\\Workspace\\file\\cn.txt");
        //OutputStreamWriter osw = new OutputStreamWriter(fis);

        //  2. 开始写入
        fw.write("你好123金色大后才能展现出空间和大伙");

        //  3. 关闭流
        fw.close();

    }

    /**
     * 读方法FileReader
     */
    public static void readText() throws IOException {

        //  1. 创建与文件的关联
        FileReader fr = new FileReader("F:\\Workspace\\file\\cn.txt");

        //  2. 开始读文件
        int ch = 0;
        while ((ch = fr.read()) != -1) {
            System.out.println((char) ch);
        }
        fr.close();

    }

}
