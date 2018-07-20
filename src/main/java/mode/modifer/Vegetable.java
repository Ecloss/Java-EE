package mode.modifer;


/**
 * 蔬菜类
 *
 * @author Ecloss
 */
public class Vegetable extends Food {

    private Food basicFood;

    /**
     * @param basicFood
     */
    public Vegetable(Food basicFood) {
        this.basicFood = basicFood;
    }

    @Override
    public String make() {
        return basicFood.make() + "+蔬菜";
    }
}
