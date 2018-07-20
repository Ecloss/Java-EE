package mode.demo;

import mode.factory.morefactory.BaseVehicleFactory;
import mode.factory.morefactory.Moveable;
import mode.factory.morefactory.PlaneFactory;

/**
 * 详细工厂模式，测试类
 *
 * @author Ecloss
 */
public class BroomFacoryDemo {

    public static void main(String[] args) {
        BaseVehicleFactory factory = new PlaneFactory();
        Moveable m = factory.create();
        m.run();
    }

}
