import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时任务小demo
 *
 * @author 余修文
 * @date 2018/9/27 14:08
 */
public class ScheduleTimeDemo01 {
    static int i= 0;

    public static void main(String[] args) {
        //timer2(i);
        timer4();
    }

    /**
     * 第一种方法：设定指定任务task在指定时间time内运行
     * schedule(TimerTask, task, Date, time)
      */
    public static void timer1() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                int i = 0;
                System.out.println("----设定要制定任务----");
            }
            // 此处设定的时间为1000毫秒
        }, 1000);
    }

    /**
     * 第二种方法：在延迟delay的基础上，再去延迟period时间持续输出timer定时任务
     */
    public static void timer2(int i) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("设定要制定任务" + (i));
            }
        }, 1000, 2000);
    }

    public static void timer3() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("----设定要制定任务----");
            }
        }, 1000, 2000);
    }

    /**
     * 安排制定的任务task，在指定的时间firstTime开始进行重复
     */
    public static void timer4() {
        Calendar calendar = Calendar.getInstance();
        // 控制时
        calendar.set(Calendar.HOUR_OF_DAY, 14);
        // 控制分
        calendar.set(Calendar.MINUTE, 46);
        // 控制秒
        calendar.set(Calendar.SECOND, 0);

        // 得到当前的时间，此处为今天的14::47:00
        Date time = calendar.getTime();

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("----定时任务----");
            }
            // 这里设定为每天执行
        }, time, 1000 * 60 * 60 * 24);
    }

}
