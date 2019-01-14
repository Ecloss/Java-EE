package io.fileReader.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字节流使用flush方法
 *
 * @author 余修文
 * @date 2019/1/1 18:58
 */
public class FileUseFlush {

    public static void main(String[] args) throws IOException {
        File file = new File("E:\\003_Code\\JAVA\\Java-EE\\src\\main\\file\\FileText04.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        String str = "Flush(), 阿西吧！";
        fileWriter.write(str);
        /** 强制性清空缓冲区 */
        fileWriter.flush();
        fileWriter.close();
    }

}
