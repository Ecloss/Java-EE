package list;

import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.Test;

import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author 余修文
 * @date 2018/11/1 16:58
 */
public class ListDemo01 {

    @Test
    public void demo01() {
        String strDate = "2018-04-22 14:20";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy-MM-dd");

        java.time.LocalDateTime date1 = java.time.LocalDateTime.parse(strDate, dateTimeFormatter);
        System.out.println(date1);
    }

}
