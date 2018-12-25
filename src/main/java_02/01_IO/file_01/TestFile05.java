package file_01;

import org.junit.Test;

import java.io.File;

/**
 * 获取目录下所有子目录的路径
 *
 * @author 余修文
 * @date 2018/12/24 22:41
 */
public class TestFile05 {

    public static void print(File file) {
        if (file.isDirectory()) {
            File[] result = file.listFiles();
            for (File file1 : result) {
                print(file1);
            }
        }
        System.out.println(file);
    }

    public static void main(String[] args) {
        File file = new File("E:\\003_Code\\JAVA\\Java-EE\\src\\main");
        if (file.isDirectory()) {
            print(file);
        }
    }

    @Test
    public void demo01() throws NumberFormatException {
        String str = "123";
        Integer num = Integer.valueOf(str);
        int num1 = Integer.valueOf(str).intValue();
        System.out.println(num + "\n" + num1);
    }

    @Test
    public void demo02() throws NumberFormatException {
        String str = "123";
        int num = Integer.parseInt(str);
        Integer num1 = (Integer) Integer.parseInt(str);
        System.out.println(num + "\n" + num1);
    }

}
