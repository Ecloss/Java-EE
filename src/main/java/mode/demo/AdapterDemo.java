package mode.demo;

import mode.adapter.Phone;
import mode.adapter.VoltagAdapter;

/**
 * 适配器模式测试
 *
 * @author Ecloss
 */
public class AdapterDemo {

    public static void main(String[] args) {
        Phone phone = new Phone();
        VoltagAdapter adapter = new VoltagAdapter();
        phone.setVoltagAdapter(adapter);
        phone.charge();
    }

}
