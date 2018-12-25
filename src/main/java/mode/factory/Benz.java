package mode.factory;

/**
 * 奔驰实现车的接口
 *
 * @author Ecloss
 */
public class Benz implements Car {

    @Override
    public void run() {
        System.out.println("Benz 开始启动了");
    }

    @Override
    public void stop() {
        System.out.println("Benz 开始停车了");
    }
}
