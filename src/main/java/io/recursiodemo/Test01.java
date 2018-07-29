package io.recursiodemo;

import io.filter.FilterBySuffix2;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * 获取一个想要的指定文件的集合。
 * 获取JavaSE_code下(包含子目录)的所有的.java的文件对象。
 * 并存储到集合中。
 *
 * @author Ecloss
 */
public class Test01 {

    /**
     * 定义一个获取指定过滤器条件的文件集合
     */
    public static List<File> fileList(File dir, String suffix) {

        // 1. 定义及合
        List<File> list = new ArrayList<File>();

        // 2. 定义过滤器：suffix为后缀名
        FileFilter filter = new FilterBySuffix2(suffix);

        getFileList(dir, list, filter);
        return list;
    }

    /**
     * 对指定目录进行递归。
     * <p>
     * 多级目录下，都要用到相同的集合和过滤器，那么不要在递归方法中定义
     * 而是不断地进行定义
     *
     * @param dir    需要遍历的目录
     * @param list   用于存储符合条件的File对象
     * @param filter 接受指定的过滤器
     */
    public static void getFileList(File dir, List<File> list, FileFilter filter) {

        //  1. 通过ListFiles方法，获取dir当前下的所有的文件和文件夹对象
        File[] files = dir.listFiles();

        //  2. 遍历该数组
        for (File file : files) {
            //  3. 判断是否是文件夹，如果是，递归。如果不是，那就是文件，那就需要对文件进行过滤
            if (file.isDirectory()) {
                getFileList(file, list, filter);
            } else {
                //  4. 通过过滤器对文件进行过滤
                if (filter.accept(file)) {
                    list.add(file);
                }
            }
        }
    }

    public static void main(String[] args) {
        /**
         * 需求：获取一个想要的指定文件的集合。获取Java-EE下的所有的.java
         */
    }

}
