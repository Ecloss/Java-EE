package mode.modifer;


/**
 * 面包类继承食物
 *
 * @author Ecloss
 */
public class Bread extends Food {

    private Food basicFood;

    /**
     * 带着食物的构造器
     *
     * @param basicFood
     */
    public Bread(Food basicFood) {
        this.basicFood = basicFood;
    }

    @Override
    public String make() {
        return basicFood.make() + "+面包";
    }
}
