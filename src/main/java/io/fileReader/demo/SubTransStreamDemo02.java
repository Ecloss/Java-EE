package io.fileReader.demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 用字符流缓冲对象
 *
 * @author Ecloss
 */
public class SubTransStreamDemo02 {

    public static void main(String[] args) throws IOException {

        copyText();

    }

    public static void copyText() throws IOException {

        //  1. 明确数据源，定义字符读取流和数据源关联
        FileReader fr = new FileReader("F:\\Workspace\\file\\fos.txt");

        //  2. 明确数据目的，定义字符输出流，创建存储数据的目的
        FileWriter fw = new FileWriter("F:\\Workspace\\file\\fox_copy.txt");

        //  3. 创建自定义缓冲区
        char[] buf = new char[1024];

        int len = 0;
        while ((len = fr.read(buf)) != -1) {
            fw.write(buf, 0, len);
        }
        fw.close();
        fr.close();
    }

}
