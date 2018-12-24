package file_01;

import java.io.File;

/**
 * 测试file属性
 *
 * @author 余修文
 * @date 2018/12/24 20:52
 */
public class TestFile01 {

    public static void main(String[] args) throws Exception {
        File file = new File("E:\\003_Code\\JAVA\\Java-EE\\src\\main\\file\\FileText01.txt");
        if (file.exists()) {
            /** 如果文件存在, 那么删除该文件 */
            file.delete();
        } else {
            /** 文件不存在，进行文件的创建 */
            System.out.println(file.createNewFile());
        }
    }

}
