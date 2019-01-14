package io.demo;

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Test;

import java.io.*;

/**
 * 测试内存流
 *
 * @author 余修文
 * @date 2019/1/14 22:10
 */
public class FileDemo02 implements Serializable {

    public static void main(String[] args) throws IOException {
        java.lang.String str = "Hello World";
        /** 本次将通过内存操作流实现转换。先将数据保存在内存流里面，而从后取出每一个数据 */
        /** 将所有要读取的数据设置到内存输入流之中，本次利用向上转型 */
        InputStream input = new ByteArrayInputStream(str.getBytes());
        /** 为了能将所有的内存流数据取出，可以使用ByteArrayOutputStream */
        OutputStream output = new ByteArrayOutputStream();
        int temp = 0;
        while ((temp = input.read()) != -1) {
            output.write(Character.toUpperCase(temp));
        }
        System.out.println(output);
    }

    @Test
    public void demo01() throws IOException {
        File file01 = new File("E:\\003_Code\\JAVA\\Java-EE\\src\\main\\file\\FileText01.txt");
        File file02 = new File("E:\\003_Code\\JAVA\\Java-EE\\src\\main\\file\\FileText02.txt");
        InputStream input01 = new FileInputStream(file01);
        InputStream input02 = new FileInputStream(file02);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        int temp = 0;
        while ((temp = input01.read()) != -1) {
            output.write(temp);
        }
        while ((temp = input02.read()) != -1) {
            output.write(temp);
        }
        byte data[] = output.toByteArray();
        input01.close();
        input02.close();
        output.close();
        System.out.println(new java.lang.String(data));
    }

}
