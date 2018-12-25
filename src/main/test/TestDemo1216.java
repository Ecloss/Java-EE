import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试时间戳
 *
 * @author 余修文
 * @date 2018/12/21 10:26
 */
public class TestDemo1216 {

    /**
     * 时间戳转换成时间
     */
    @Test
    public void demo01() {
        /** 时间戳 */
        String s = "1545098699000";
        long it = new Long(s);
        Date date = new Date(it);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String res = simpleDateFormat.format(date);
        System.out.println(res);
    }

    /**
     * 时间转成时间戳
     */
    @Test
    public void demo02() throws ParseException {
        /** 时间 */
        String res = "2018-12-18 10:04:59";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(res);
        long it = date.getTime();
        String s = String.valueOf(it);
        System.out.println(s);
    }

}
