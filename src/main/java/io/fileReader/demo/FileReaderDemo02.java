package io.fileReader.demo;

import java.io.*;

/**
 * fileReader的测试用例
 *
 * @author 余修文
 * @date 2019/1/1 18:41
 */
public class FileReaderDemo02 {

    public static void main(String[] args) throws IOException {
        /** 定义要输入的文件路径 */
        File file = new File("E:\\003_Code\\JAVA\\Java-EE\\src\\main\\file\\FileText04.txt");
        if (file.exists()) {
            /** 为reader对象实例化 */
            Reader reader = new FileReader(file);
            /** 读取这个实例 */
            char[] data = new char[1024];
            int len = reader.read(data);
            reader.close();
            System.out.println(new java.lang.String(data, 0, len));
        }
    }

}
