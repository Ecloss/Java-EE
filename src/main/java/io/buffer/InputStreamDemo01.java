package io.buffer;

import com.sun.xml.internal.ws.policy.PolicyException;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字符流，字节流
 *
 * @author Ecloss
 */
public class InputStreamDemo01 {

    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("F:\\Workspace\\file\\12.jpg");
            fos = new FileOutputStream("F:\\Workspace\\file\\temp\\12_copy.jpg");
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
                    fos.close();
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
