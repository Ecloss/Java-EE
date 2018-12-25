package io.fileoutputstream.io_exception;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 处理IO异常的规范写法
 *
 * @author Ecloss
 */
public class IOExceptionDemo {

    /**
     * IO异常的处理方式：IO一定要写finally
     */
    public static void main(String[] args) {

        File dir = new File("F:\\Workspace\\file");
        if (!dir.exists()) {
            dir.mkdir();
        }

        //  如果try中内容失败，fos还是null所以finally要先判断是否为空
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("F:\\Workspace\\file\\001.txt");
        } catch (IOException e) {
            System.out.println(e.toString() + "----");
        } finally {
            //  一定要在释放前先判断
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    //  不要把异常抛给main函数，并让主函数声明，虚拟机处理
                    throw new RuntimeException("关闭失败" + e);
                }
            }
        }

    }

}
