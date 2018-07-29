package io.buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 自定义缓冲区方法测试
 *
 * @author Ecloss
 */
public class MyBufferedReaderDemo {

    public MyBufferedReaderDemo(FileReader fr) {

    }

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("F:\\Workspace\\file\\003.txt");

        //  原先的做法：
        BufferedReader bufr = new BufferedReader(fr);
        String line = null;
        while ((line = bufr.readLine()) != null) {
            System.out.println(line);
        }
        bufr.close();

        //  现在的做法
        MyBufferReader mbufr = new MyBufferReader(fr);
        String line1 = null;
        while ((line1 = mbufr.myReadLine()) != null) {
            System.out.println(line1);
        }
        mbufr.myClose();
    }

}
