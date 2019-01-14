package file_01;

import org.junit.Test;

import java.io.*;
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

        /** 获取文件的路径 */
        System.out.println("文件的路径：" + file.getPath());
    }

    @Test
    public void demo01() throws IOException {
        File file = new File("E:\\003_Code\\JAVA\\Java-EE\\src\\main\\file\\FileText03.txt");
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write("我喜欢你，是我独家的记忆".getBytes("UTF-8"));
        outputStream.close();
    }

    @Test
    public void demo02() {
        System.getProperties().list(System.out);
    }

}
