package io.demo;

import java.io.File;

/**
 * IO流
 * File只能操作文件或者文件的属性，对文件的创建，删除，获取文件属性
 *
 * @author Ecloss
 */
public class FileDemo {

    private static final String FILE_SEPARATOR = System.getProperty("file.separator");

    public static void main(String[] args) {
        File file = new File("F:\\1.txt");

        //  File(String parent, String child);
        File file1 = new File("F:\\", "2.txt");

        //  3. 另外的方法
        File dir = new File("F:\\");
        File file2 = new File(dir, "3.txt");

        File f = new File("d:" + File.separator + "abc" + File.separator + "1.txt");
        System.out.println(f);

    }

}
