package io.recursio.file;

import java.io.File;

/**
 * 遍历指定目录下的内容，要求包含子目录的内容
 *
 * @author Ecloss
 */
public class GetAllFilesTest {

    public static void getAllFiles(File dir) {

        System.out.println("dir = " + dir);

        // 1. 获取该目录的文件对象数组
        File[] files = dir.listFiles();

        // 2. 对数组进行遍历
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    getAllFiles(file);
                } else {
                    System.out.println("file: " + file);
                }
            }
        }

    }

    public static void main(String[] args) {

        /**
         * 遍历指定目录下的内容（包含子目录中的内容）
         *
         * 递归：函数自身调用自身，不断进栈。函数内部又使用到了该函数功能
         * 什么时候使用呢？
         * 功能被重复使用，但是每次该功能使用参与运算的数据不同时，
         */
        File dir = new File("F:\\Workspace\\Java-EE\\Java-EE");
        getAllFiles(dir);

    }

}
