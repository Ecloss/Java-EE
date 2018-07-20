package mode.proxy;

/**
 * 正常人结婚，
 *
 * @author Ecloss
 */
public class NormalHome implements ProxyInterface {

    @Override
    public void marry() {
        System.out.println("我们结婚啦~");
    }
}
