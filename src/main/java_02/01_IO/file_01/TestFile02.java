package file_01;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * getParentFile
 *
 * @author 余修文
 * @date 2018/12/24 21:25
 */
public class TestFile02 {

    public static void main(String[] args) throws IOException {
        File file = new File("E:\\003_Code\\JAVA\\Java-EE\\src\\main\\file\\FileText01.txt");
        /** 如果父路径不存在 */
        if (!file.getParentFile().exists()) {
            System.out.println(file.mkdir());
        } else {
            System.out.println("父路径已经存在！");
        }
        /** 如果文件不存在，创建文件 */
        if (!file.exists()) {
            System.out.println(file.createNewFile());
        } else {
            System.out.println("文件已经存在！");
        }

        /** 获取文件大小 */
        System.out.println("文件大小是：" + new BigDecimal(file.length() / 1024).divide(new BigDecimal(1), 2, BigDecimal.ROUND_HALF_UP) + "M");
    }

}
