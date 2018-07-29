package io.fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 第二种字节流读取方式：创建一个缓冲区字节数组
 *
 * @author Ecloss
 */
public class FIleInputStreamDemo2 {

    private static final int DEFAULT_SIZE = 1024 * 1024 * 2;

    public static void main(String args[]) {

        //  演示第二种读取方式，read(byte[]);  -->
        File file = new File("F:\\Workspace\\file\\fos.txt");
        if (!file.exists()) {
            throw new RuntimeException("要读取的文件不存在");
        }

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);

            // 创建一个缓冲区字节数组
            byte[] buf = new byte[DEFAULT_SIZE];

            int len = 0;
            while ((len = fis.read(buf)) != -1) {
                System.out.println(new String(buf, 0, len));
            }
        } catch (IOException e) {
            // 一般将异常信息写入到日志文件中，进行记录
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {

                }
            }
        }

    }

}
