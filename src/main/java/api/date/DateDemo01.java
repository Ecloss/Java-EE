package api.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期函数
 *
 * @author 余修文
 * @date 2018/7/30 23:11
 */
public class DateDemo01 {

    public static void main(String[] args) {

        /**
         * 演示Date对象
         * 将日期对象转换成日期格式的字符串--> DateFormat类中的format方法
         * 日期的格式化
         */
        Date date = new Date();
        System.out.println(date);

        // 通过DateFormat类中的静态工厂方法获取示例
        DateFormat dateFormat = DateFormat.getDateInstance();

        // 通过DateFormat的format方法，对日期对象进行格式化，将日期对象转成日期格式的字符串
        String strDate1 = dateFormat.format(date);
        System.out.println(strDate1);

        // 转换成自定义风格。xxxx-xx-xx xx:xx 只能自定义格式化风格的对象，只有子类可以做到
        dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        String strDate02 = dateFormat.format(date);
        System.out.println(strDate02);

    }

}
