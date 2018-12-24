package file_01;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 判断是否是文件或目录
 *
 * @author 余修文
 * @date 2018/12/24 22:01
 */
public class TestFile03 {

    public static void main(String[] args) throws IOException {
        File file = new File("E:\\003_Code\\JAVA\\Java-EE\\src\\main\\file\\FileText01.txt");
        if (!file.exists()) {
            file.createNewFile();
        } else {
            if (file.isFile()) {
                System.out.println("文件大小是：" + new BigDecimal(file.length() / 1024).divide(new BigDecimal(1), 2, BigDecimal.ROUND_HALF_UP));
            }
        }
        /** 获取上次修改时间 */
        Long longTime = file.lastModified();
        System.out.println(longTime);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = new Date(longTime);
        String str = simpleDateFormat.format(date);
        System.out.println("上一次修改时间是：" + str);
    }

}
