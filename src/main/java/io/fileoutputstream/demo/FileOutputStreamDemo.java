package io.fileoutputstream.demo;

import org.joda.time.DateTime;
import org.junit.Test;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 字节输出流
 * FileoutputStream:文件输出流是用于将数据写入File或FileDescriptor的输出流。
 * 注意处理IO异常。续写和换行。
 *
 * @author Ecloss
 */
public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {

        /**
         * 将数据写入到文件中
         * 使用字节输出流
         * FileOutputStream
         */
        File dir = new File("F:\\Workspace\\file");
        //  exists : 查看文件存在
        if (!dir.exists()) {
            dir.mkdir();
        }

        //  1. 创建字节输出流对象，用于操作文件，在对象初始化时，必须明确数据存储的目的地
        //  输出流所关联的目的地，如果不存在，会自动创建。如果床架，则替换并覆盖
        FileOutputStream fos = new FileOutputStream("F:\\Workspace\\file\\fos.txt");

        //  2. 调用输出流的写功能
        String str = "abcde";
        byte[] buf = str.getBytes();
        fos.write(buf);

        //  3. 释放资源
        fos.close();

    }

    /**
     * F:\Workspace\Java-EE\Java-EE\src\main\file\FileText01.txt
     */
    @Test
    public void demo01() throws IOException {
        File file = new File("F:\\Workspace\\Java-EE\\Java-EE\\src\\main\\file\\FileText01.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        if (file.isFile()) {
            System.out.println("file的长度是：" + file.length());
            Reader reader = new FileReader(file);
            /** 读取这个实例 */
            char[] data = new char[1024];
            int len = reader.read(data);
            System.out.println(new String(data, 0, len));
            reader.close();
        }
    }

    /**
     * fileWriter
     */
    @Test
    public void demo02() throws IOException {
        File file = new File("F:\\Workspace\\Java-EE\\Java-EE\\src\\main\\file\\FileText01.txt");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        Writer writer = new FileWriter(file);
        String str = "我们都在阴沟里，但总有人仰望星空。";
        writer.write(str);
        writer.close();
    }

    private final static int DEFAULTSIZE = 1024 * 1024 * 2;

    /**
     * 读数据
     * fileInputStream
     */
    @Test
    public void demo03() {
        File file = new File("F:\\Workspace\\Java-EE\\Java-EE\\src\\main\\file\\FileText01.txt");
        if (!file.exists()) {
            throw new RuntimeException("要读取的文件不存在");
        }
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);

            /** 创建一个缓冲区字节数组 */
            byte[] buf = new byte[DEFAULTSIZE];
            int len = 0;
            while ((len = fileInputStream.read(buf)) != -1) {
                System.out.println(new String(buf, 0, len));
            }
        } catch (IOException e) {
            throw new RuntimeException("读取文件失败");
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * FileOutputStream
     */
    @Test
    public void demo04() throws IOException {
        File file = new File("F:\\Workspace\\Java-EE\\Java-EE\\src\\main\\file\\FileText01.txt");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        /** 1. 实例化 */
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        /** 进行文件输出 */
        String str = "甚爱必大费，多藏必厚亡";
        byte[] bytes = str.getBytes();
        /** 进行写的操作 */
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

    @Test
    public void  demo05() throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
        String str = sdf.format(date);
        System.out.println(str);
        Date date1 = sdf.parse(str);
        System.out.println(date1);
        System.out.println(new Date());
    }

    @Test
    public void demo06() {
        Calendar Cld = Calendar.getInstance();

        int YY = Cld.get(Calendar.YEAR) ;
        int MM = Cld.get(Calendar.MONTH)+1;
        int DD = Cld.get(Calendar.DATE);
        int HH = Cld.get(Calendar.HOUR_OF_DAY);
        int mm = Cld.get(Calendar.MINUTE);
        int SS = Cld.get(Calendar.SECOND);
        int MI = Cld.get(Calendar.MILLISECOND);

        //String curTime = YY + MM + DD + HH + mm + SS + MI;

        Calendar cal = Calendar.getInstance();
        java.util.Date date = cal.getTime();

        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyyMMddhhmmssSSS");

        //String myTime = sdFormat.format(currentTime);
    }

}
