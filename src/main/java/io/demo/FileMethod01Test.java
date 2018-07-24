package io.demo;

import java.io.File;

/**
 * File的其它方法
 *
 * @author Ecloss
 */
public class FileMethod01Test {

    public static void main(String[] args) {
        /**
         * File方法
         * 1. 获取文件的绝对路径
         *      String getAbsolutePath();
         */
        File file = new File("1.txt");
        methodDemo1();
    }

    public static void methodDemo1() {
        File file = new File("abc\\1.txt");
        /**
         * 获取绝对路径
         */
        String path = file.getAbsolutePath();
        /**
         * 获取封装的路径
         */
        String  path1 = file.getPath();
        System.out.println(path);
        System.out.println("path1 = " + path);

        File file1 = new File("F:\\123.txt");
    }

}