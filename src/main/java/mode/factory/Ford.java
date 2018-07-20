package mode.factory;

/**
 * Ford实现car的接口
 *
 * @author Ecloss
 */
public class Ford implements Car{

    @Override
    public void run() {
        System.out.println("Ford 开始启动了");
    }

    @Override
    public void stop() {
        System.out.println("Ford 开始停车了");
    }
}
