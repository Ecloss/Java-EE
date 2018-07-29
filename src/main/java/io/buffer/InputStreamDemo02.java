package io.buffer;

import socket.manWoman.Input;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author 余修文
 * @date 2018/7/29 14:27
 */
public class InputStreamDemo02 {

    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("F:\\Workspace\\file\\002.txt");
            fos = new FileOutputStream("F:\\Workspace\\file\\002_copy1.txt");
            byte[] buf = new byte[1024];
            int num = 0;
            while ((num = fis.read(buf, 0, 1024)) != -1) {
                fos.write(buf, 0, 1024);
                fos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null && fos != null) {
                    fis.close();
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
