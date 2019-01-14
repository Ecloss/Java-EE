package io.fileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * FileWriter 的用例测试
 *
 * @author 余修文
 * @date 2019/1/1 18:06
 */
public class FileWriterDemo01 {

    public static void main(String[] args) throws IOException {
        File file = new File("E:\\003_Code\\JAVA\\Java-EE\\src\\main\\file\\FileText04.txt");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        Writer writer = new FileWriter(file);
        String str = "我们都在阴沟里，但仍有人仰望星空";
        writer.write(str);
        writer.close();
    }

}
