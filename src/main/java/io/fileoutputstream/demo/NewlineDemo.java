package io.fileoutputstream.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 实现续写和换行操作
 *
 * @author Ecloss
 */
public class NewlineDemo {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static void main(String[] args) {

        /**
         * 续写和换行
         * Windows换行符是"\r\n"
         * System.getProperty("line.separator");
         */
        File dir = new File("F:\\Workspace\\file");
        if (!dir.exists()) {
            dir.mkdir();
        }

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("F:\\Workspace\\file\\002.txt", true);
            String str = LINE_SEPARATOR + "abc";
            fos.write(str.getBytes());
        } catch (IOException e) {
            System.out.println(e.toString() + "----");
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException("" + e);
                }
            }
        }

    }

}
