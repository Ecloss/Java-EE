package io.bufferedinputstream;

import java.io.*;

/**
 * 复制图片
 *
 * @author Ecloss
 */
public class CopyPicByBufferDemo {

    /**
     * 缓冲区的作用就是为了提高操作数据的效率，
     * 可以避免频繁在硬盘上寻道操作
     * 缓冲区创建时，必须有被缓冲的流对象
     */
    public static void main(String args[]) throws IOException {
        copyPicByBuffer();
    }

    public static void copyPicByBuffer() throws IOException {

        //  演示缓冲区
        //  1. 创建具体的流对象
        FileInputStream fis = new FileInputStream("F:\\Workspace\\file\\12.jpg");

        // 2. 让缓冲区与指定流相关联
        //对流中的数据进行缓冲。位于内存中的缓冲区的数据读写速度远远大于硬盘上的读写
        BufferedInputStream bufis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("F:\\Workspace\\file\\12_copy.jpg");

        BufferedOutputStream bufos = new BufferedOutputStream(fos);

        byte[] buf = new byte[1024];

        int len = 0;

        while ((len = bufis.read(buf)) != -1) {
            // 使用缓冲区的写入方法将数据先写入到缓冲区中
            bufos.write(buf, 0, len);
            //  将缓冲区的数据刷新到底层目的地中。（即使不谢，缓冲区满了，java也会自动刷新）
            bufos.flush();
        }

        bufos.close();
        bufis.close();
    }

}
