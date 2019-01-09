package io.fileoutputstream.demo;

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Test;

import java.io.*;

/**
 * 复习输出流
 *
 * @author 余修文
 * @date 2018/12/26 9:22
 */
public class FileOutputStreamDemo3 {

    public static void main(String[] args) throws IOException {
        /** 输出流的四个步骤 */
        /**
         * 1. 先创建文件路径
         * 因为OutputStream 的子类FileOutputStream 是由File为构造参数构建的
         */
        File file = new File("F:\\Workspace\\Java-EE\\Java-EE\\src\\main\\file\\FileText01.txt");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }

        /** 2. 创建OutputStream  */
        OutputStream outputStream = new FileOutputStream(file);

        /** 3. 输出流，进行写的功能 */
        java.lang.String str = "热爱生活";
        byte[] bytes = str.getBytes();
        outputStream.write(bytes);

        /** 4. 关闭资源 */
        outputStream.close();
    }

    public static void copyText() throws IOException {
        File file = new File("F:\\Workspace\\Java-EE\\Java-EE\\src\\main\\file\\FileText01.txt");
        File file1 = new File("F:\\Workspace\\Java-EE\\Java-EE\\src\\main\\file\\FileText02.txt");

        /** 输入流 */
        InputStream inputStream = new FileInputStream(file);

        /** 输出流 */
        OutputStream outputStream = new FileOutputStream(file1);

        /** 进行读写功能 */
        int x = 0;
        while ((x = inputStream.read()) != -1) {
            outputStream.write(x);
        }

        /** 关闭资源 */
        inputStream.close();
        outputStream.close();
    }

    @Test
    public void demo01() throws IOException {
        copyText();
    }

    public final static Integer DEFAULT_SIZE = 1024 * 1024 * 2;

    public static void copyText01() throws IOException {
        File file = new File("F:\\Workspace\\Java-EE\\Java-EE\\src\\main\\file\\FileText01.txt");
        if (!file.exists()) {
            throw new RuntimeException("要读取的文件不存在！");
        }

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);

            /** 定义缓冲区 */
            byte[] buf = new byte[DEFAULT_SIZE];

            int len = 0;
            while ((len = fis.read(buf)) != -1) {
                System.out.println(new java.lang.String(buf, 0, len));
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

    @Test
    public void demo02() throws IOException {
        copyText01();
    }

}
