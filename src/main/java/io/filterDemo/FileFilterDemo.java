package io.filterDemo;

import io.filter.FilterByDirectory;
import io.filter.FilterByFile;
import io.filter.FilterBySuffix2;

import java.io.File;
import java.io.FileFilter;

/**
 * 测试pathname.isDirectory()方法  和  pathname.isFile()方法：只过滤文件名不过滤文件夹
 * 还有pathname.getName().endsWith(suffix)方法
 *
 * @author Ecloss
 */
public class FileFilterDemo {

    public static void main(String[] args) {

        File dir = new File("F:\\Workspace\\C\\第二章：入门");

        //  过滤出当前目录下所有文件
        FileFilter filter = new FilterByFile();
        //  过滤出当前目录下所有的文件夹
        filter = new FilterByDirectory();
        //  过滤出当前，目录下所有以指定后缀名结尾的文件和文件夹
        filter = new FilterBySuffix2(".cpp");

        File[] files = dir.listFiles(filter);

        for (File file : files) {
            /**
             * F:\Workspace\C\第二章：入门\0001_指针.cpp
             F:\Workspace\C\第二章：入门\0002_指针和数组.cpp
             F:\Workspace\C\第二章：入门\0003_数组和指针.cpp
             F:\Workspace\C\第二章：入门\0004_指针相减.cpp
             */
            System.out.println(file);
        }
        System.out.println("-----------------------");

    }

}
