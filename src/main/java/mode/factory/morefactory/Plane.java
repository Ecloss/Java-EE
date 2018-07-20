package mode.factory.morefactory;

/**
 * 具体产品角色
 *
 * @author Ecloss
 */
public class Plane implements Moveable {

    @Override
    public void run() {
        System.out.println("plane....");
    }
}
