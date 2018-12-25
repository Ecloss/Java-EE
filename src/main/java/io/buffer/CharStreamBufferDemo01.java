package io.buffer;

import java.io.*;

/**
 * BufferXXX：缓冲字符流存在的好处是：为了高效，并且有readLine(),newLine()
 *
 * @author Ecloss
 */
public class CharStreamBufferDemo01 {

    public static void main(String[] args) throws IOException {

        //readTextByBuffered();
        writeTextByBuffered();

    }

    public static void readTextByBuffered() throws IOException {

        //  1. 创建字符流读入对象
        FileReader fr = new FileReader("F:\\Workspace\\file\\fos.txt");

        BufferedReader bufr = new BufferedReader(fr);

        //因为只有文本具备行的特性，所以又有了一个只针对文本的新方法：readLine();不包含终止符'\n'、'\r'。
        String line = null;
        while ((line = bufr.readLine()) != null) {
            System.out.println(line);
        }
        bufr.close();

    }

    //  写字符流
    public static void writeTextByBuffered() throws IOException {

        //  1. 创建字符流读对象
        FileWriter fw = new FileWriter("F:\\Workspace\\file\\fos.txt");

        //  2, 创建与字符写对象相关的缓冲区
        BufferedWriter bufw = new BufferedWriter(fw);

        //  3.开始写入流对象
        for (int i = 1; i <= 4; i++) {
            bufw.write(i + "abc");
            bufw.newLine();
            bufw.flush();
        }

        //  4. 关闭流对象
        bufw.close();

    }

}
