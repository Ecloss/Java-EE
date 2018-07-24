package io.demo;

import java.io.File;

/**
 * 过滤器
 *
 * @author Ecloss
 */
public class FileMethodDemo {

    public static void main(String[] args) {
        /**
         * File类，常见方法
         *
         */
        File file = new File("F:\\1.txt");
        String file_name = file.getName();
        System.out.println(file_name);

        long len = file.length();
        System.out.println(len);

        System.out.println(file.getParent());
    }

}
