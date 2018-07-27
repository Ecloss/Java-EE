package io.fileinputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 自定义缓冲区
 *
 * @author Ecloss
 */
public class CopyTextTest02 {

    public static void main(String[] args) {

        cooyTextByBuf();

    }

    public static void cooyTextByBuf() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("F:\\Workspace\\file\\003.txt");
            fos = new FileOutputStream("F:\\Workspace\\file\\003_copy.txt");

            // 创建缓冲区
            byte[] buf = new byte[1024];
            // 定义记录字符个数的变量
            int len = 0;
            // 循环读写
            while ((len = fis.read(buf)) != -1) {
                fos.write(buf, 0, len);
            }
        } catch (IOException e) {
            System.out.println("异常日志");
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    System.out.println("输出流异常");
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println("输入流异常");
                }
            }
        }
    }

}
