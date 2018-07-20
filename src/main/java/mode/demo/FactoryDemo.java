package mode.demo;

import jdk.nashorn.internal.ir.IfNode;
import mode.factory.Car;
import mode.factory.Factory;

/**
 * 工厂模式的测试
 *
 * @author Ecloss
 */
public class FactoryDemo {

    public static void main(String[] args) {
        Car c = Factory.getCarInstance("Benz");
        if (c != null) {
            c.run();
            c.stop();
        } else {
            System.out.println("造不了这种汽车");
        }
    }

}
