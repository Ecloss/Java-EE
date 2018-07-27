package io.filter;

import java.io.File;
import java.io.FileFilter;

/**
 * 文件过滤器，只筛选出文件，不要文件夹
 *
 * @author Ecloss
 */
public class FilterByFile implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        return pathname.isFile();
    }

}
