package file_01;

import java.io.File;
import java.util.Arrays;

/**
 * 获取目录下所有的file文件信息
 *
 * @author 余修文
 * @date 2018/12/24 22:27
 */
public class TestFile04 {

    public static void main(String[] args) throws Exception {
        File file = new File("E:\\003_Code\\JAVA\\Java-EE\\src\\main\\file");
        /** 如果目录不存在，创建该目录 */
        if (!file.exists()) {
            file.mkdir();
        } else {
            /** 获取该目录下的信息，以String形式返回 */
            String[] strFilse = file.list();
            Arrays.asList(strFilse).stream().forEach(str -> System.out.println(str));
        }

        /** 在创建一个file文件 */
        File file1 = new File("E:\\003_Code\\JAVA\\Java-EE\\src\\main\\file\\FileText02.txt");
        if (!file1.exists()) {
            file1.createNewFile();
        }
        File[] files = file.listFiles();
        Arrays.asList(files).stream().forEach(file2 -> System.out.println(file2));

    }

}
