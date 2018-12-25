package io.filter;

import java.io.File;
import java.io.FileFilter;

/**
 * 文件过滤器的方法，过滤器指定类型文件的过滤器
 * 使用pathname.getName().endsWith(".java");
 * 可以实现同样的文件名过滤操作
 *
 * @author Ecloss
 */
public class FilterBySuffix2 implements FileFilter {

    private String suffix;

    public FilterBySuffix2(String suffix) {
        super();
        this.suffix = suffix;
    }

    @Override
    public boolean accept(File pathname) {
        // 用suffix的操作是为了使实用类，和该类的耦合度降低
        return pathname.getName().endsWith(suffix);
    }

}
