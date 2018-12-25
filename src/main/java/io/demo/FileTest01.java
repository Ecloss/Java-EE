package io.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 简单的测试
 *
 * @author Ecloss
 */
public class FileTest01 {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("F:\\Workspace\\file\\001.txt");

        String s = "";
        String temp = "";
        char[] buf = new char[3];
        int num = 0;
        //  把0到3的长度存到buf中
        while ((num = fr.read(buf, 0, 3)) != -1) {
            temp = new String(buf, 0, num);
            System.out.println(temp + " ");
            s += temp;
        }
        System.out.println();
        System.out.println(s);
        fr.close();

    }

}
