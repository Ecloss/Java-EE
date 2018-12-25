package modedesign.singleton;

/**
 * 懒汉模式:  在对象被生成时，便已经生成对象
 *
 * @author Ecloss
 */
public class HungrySingle {

    private  HungrySingle hungrySingle = new HungrySingle();

    private HungrySingle() {
    }

    public HungrySingle getInstance() {
        return hungrySingle;
    }
}
