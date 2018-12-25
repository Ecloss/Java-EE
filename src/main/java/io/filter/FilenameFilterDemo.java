package io.filter;

import java.io.File;

/**
 * 获取指定目录下的.java 文件
 *
 * @author Ecloss
 */
public class FilenameFilterDemo {

    public static void main(String[] args) {

        //  文件名过滤器：让容器和过滤条件分离，降低耦合性
        //  类似于比较器，都属于策略设计模式，不要面对具体的过滤或者排序动作，只面对接口
        File dir = new File("F:\\Workspace\\C\\第二章：入门");
        //  传入一个过滤器
        String[] names = dir.list(new FilterBySuffix(".cpp"));
        for (String name : names) {
            System.out.println(name);
        }

    }

}
