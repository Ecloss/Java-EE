package io.filterDemo;

import io.filter.FilterByContain;
import io.filter.FilterBySuffix;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 获取指定目录下，文件名中包括制定字段的文件
 *
 * @author Ecloss
 */
public class FilenameFilterDemo2 {

    public static void main(String[] args) {

        //  需求：不是获取指定后缀名的文件，而是获取文件名中包含制定字段的文件
        File dir = new File("F:\\Workspace\\C\\第二章：入门");

        //  过滤后缀名的过滤器
        FilenameFilter filter = new FilterBySuffix(".cpp");
        //  过滤内容的过滤器
        filter = new FilterByContain("demo");

        String[] names = dir.list(filter);

        for (String name : names) {

        }

    }

}
