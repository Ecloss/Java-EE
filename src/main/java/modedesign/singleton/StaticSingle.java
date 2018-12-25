package modedesign.singleton;



/**
 * 静态内部类：在类内部创建一个静态类，每次调用getInstance时便用静态内部类创建一个对象
 *
 * @author Ecloss
 */
public class StaticSingle {

    private static class SingleHolder {
        private static final StaticSingle STATIC_SINGLE = new StaticSingle();
    }

    private StaticSingle() {
    }

    public StaticSingle getInstance() {
        return SingleHolder.STATIC_SINGLE;
    }
}
