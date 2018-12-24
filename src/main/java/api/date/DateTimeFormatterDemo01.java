package api.date;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

/**
 * @author 余修文
 * @date 2018/10/29 22:20
 */
public class DateTimeFormatterDemo01 {

    @Test
    public void demo01() {
        /**
         * dateFormatter 不仅仅可以将日期，时间对象格式化成字符串，也可以将特定格式的字符串解析成日期，时间对象
         */
        // 获取DateFormatter 的三种方式
        DateTimeFormatter[] df = new DateTimeFormatter[] {
                DateTimeFormatter.ISO_LOCAL_DATE,
                DateTimeFormatter.ISO_LOCAL_TIME,
                DateTimeFormatter.ISO_LOCAL_DATE_TIME,
                // 2. 使用本地化的不同风格来创建DateTimeFormatter 格式器
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM),
                DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG),
                // 3. 根据字符串来创建
        };
        LocalDateTime date = LocalDateTime.now();

        // 依次使用不同的格式器对LocalDateTime 进行格式化
        for (int i = 0; i < df.length; i++) {
            // 下面两行代码的作用相同
            System.out.println(df[i].format(date));
        }

    }

    @Test
    public void demo02() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        Date date1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = sdf.format(date1);
    }

}
