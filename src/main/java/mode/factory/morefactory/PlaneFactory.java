package mode.factory.morefactory;

/**
 * 具体工厂模式
 *
 * @author Ecloss
 */
public class PlaneFactory extends BaseVehicleFactory {

    @Override
    public Moveable create() {
        return new Plane();
    }
}
