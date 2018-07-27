package io.filter;

import java.io.File;
import java.io.FileFilter;

/**
 * 只过滤文件，不需要文件夹
 *
 * @author Ecloss
 */
public class FilterByDirectory implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        return pathname.isDirectory();
    }

}
