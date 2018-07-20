package mode.demo;

import mode.observer.LaoLi;
import mode.observer.LaoWang;
import mode.observer.XiaoMei;

/**
 * 观察者模式的测试
 *
 * @author Ecloss
 */
public class ObserverMode {

    public static void main(String[] args) {
        XiaoMei xiaoMei = new XiaoMei();
        LaoWang laoWang = new LaoWang();
        LaoLi laoLi = new LaoLi();
        xiaoMei.addPerson(laoWang);
        xiaoMei.addPerson(laoLi);

        xiaoMei.notifyPerson();
    }


}
