package io.filter;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件过滤器
 *
 * @author Ecloss
 */
public class FilterBySuffix implements FilenameFilter {

    private String suffix;

    public FilterBySuffix(String suffix) {
        super();
        this.suffix = suffix;
    }

    /**
     * @param dir
     * @param name
     * @return
     */
    @Override
    public boolean accept(File dir, String name) {
        return  name.endsWith(suffix);
    }
}
