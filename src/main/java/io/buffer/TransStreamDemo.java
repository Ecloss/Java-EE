package io.buffer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 转换流：只要是字符输出流，都有查表后的缓冲区。所以它的write()方法后面一定要跟随flush()刷新操作
 *
 * @author Ecloss
 */
public class TransStreamDemo {

    public static void main(String[] args) throws IOException {

        writeCNText();

    }

    public static void writeCNText() throws IOException {

        //  1.创建字节流对象
        FileOutputStream fos = new FileOutputStream("F:\\Workspace\\file\\cn.txt");

        //  2.创建字符通向字节的桥梁
        OutputStreamWriter osw = new OutputStreamWriter(fos);

        //  3.使用osw的write方法直接写中文字符串。因为需要拿着字符数据去查表，所以写入字节数据前，都会存到缓冲区去
        osw.write("你不好12312qwe2");

        //  4.需要刷新该字符流的缓冲区，将查表得到的字节数据写到fos流中
        //osw.flush();

        //  5.关闭此流前，先刷新一下
        osw.close();

    }

}
