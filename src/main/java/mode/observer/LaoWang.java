package mode.observer;

import socket.producer_consumber.producer.Producer;

/**
 * 老王接受消息
 *
 * @author Ecloss
 */
public class LaoWang implements Person {

    private String name = "老王";

    public LaoWang() {
    }

    @Override
    public void getMessage(String s) {
        System.out.println(name + "接到了小美打过来的电话，电话内容是：" + s);
    }
}
