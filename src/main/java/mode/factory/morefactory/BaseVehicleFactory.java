package mode.factory.morefactory;

/**
 * 抽象工厂模式
 *
 * @author Ecloss
 */
public abstract class BaseVehicleFactory {

    /**
     * 工厂模式，是为了创建一个抽象产品
     *
     * @return
     */
    public abstract Moveable create();

}
