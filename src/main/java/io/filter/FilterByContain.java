package io.filter;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 文件名包括制定字段的过滤器
 *
 * @author Ecloss
 */
public class FilterByContain implements FilenameFilter {

    private String content;

    public FilterByContain(String content) {
        super();
        this.content = content;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.contains(content);
    }
}
