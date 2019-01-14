package io.demo02;

import org.junit.Test;

import java.io.*;

/**
 * 打印流
 *
 * @author 余修文
 * @date 2019/1/14 22:41
 */
public class IOStream01 implements Serializable {

    @Test
    public void demo01() throws IOException {
        File file = new File("E:\\003_Code\\JAVA\\Java-EE\\src\\main\\file\\FileText01.txt");
        /** 向文件输出 */
        PrintUtil printUtil = new PrintUtil(new FileOutputStream(file));
        printUtil.print("Hello ");
        printUtil.println(1 + 1);
        printUtil.println(1.1 + 1.1);
        PrintUtil printUtil1 = new PrintUtil(new FileOutputStream(file));
        /** 向内存输出 */

    }

}

/**
 * 专门进行输出操作
 */
class PrintUtil {
    /**
     * 输出只能够依靠OutputStream
     * FileOutputStream  向文件
     * ByteArrayOutputStream 向内存
     */
    private OutputStream outputStream;

    public PrintUtil(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void print(int x) {
        this.print(String.valueOf(x));
    }

    public void print(String x) {
        try {
            this.outputStream.write(x.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void print(double x) {
        this.print(String.valueOf(x));
    }

    public void println(int x) {
        this.println(String.valueOf(x));
    }

    public void println(String x) {
        this.print(x.concat("\n"));
    }

    public void println(double x) {
        this.println(String.valueOf(x));
    }

    public void close() {
        try {
            this.outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
