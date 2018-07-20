package mode.adapter;

/**
 * 手机类 电压为220V
 * 流程大概是这样的，在手机类中添加一个适配器，给它赋值后，在调用适配器的方法
 *
 * @author Ecloss
 */
public class Phone {

    public static final int V = 220;

    private VoltagAdapter voltagAdapter;

    /**
     * 充电
     */
    public void charge() {
        //也就是这里要添加一个适配器才能正常工作
        voltagAdapter.changeVoltage();
    }

    public void setVoltagAdapter(VoltagAdapter voltagAdapter) {
        this.voltagAdapter = voltagAdapter;
    }
}
