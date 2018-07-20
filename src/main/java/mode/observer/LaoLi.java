package mode.observer;

/**
 * 老李接受消息
 *
 * @author Ecloss
 */
public class LaoLi implements Person {

    private String name = "LaoLi";

    public LaoLi() {
    }

    @Override
    public void getMessage(String s) {
        System.out.println(name + "接收到小美打过来的电话,内容是：" + s);
    }
}
