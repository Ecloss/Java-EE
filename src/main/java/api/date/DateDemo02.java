package api.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将日期格式的字符串转换为对象
 *
 * @author 余修文
 * @date 2018/7/30 23:21
 */
public class DateDemo02 {

    public static void main(String[] args) throws ParseException {

        /**
         * 日期格式的字符串："2013-07-17"
         */
        String strDate01 = "2013-07-17";

        DateFormat dateFormat = DateFormat.getDateInstance();

        // 解析
        Date date = dateFormat.parse(strDate01);

        System.out.println(date);

        // 解析自定义格式日期字符串，转成日期对象

        String strDate02 = "2018-08-30 23:25";

        // 自定义日期格式器
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");

        Date date1 = dateFormat1.parse(strDate02);

        System.out.println(date1);

    }

}
