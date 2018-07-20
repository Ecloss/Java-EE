package mode.modifer;

/**
 * 奶油类
 *
 * @author Ecloss
 */
public class Cream extends Food {

    private Food basicFood;

    /**
     * @param basicFood
     */
    public Cream(Food basicFood) {
        this.basicFood = basicFood;
    }

    @Override
    public String make() {
        return basicFood.make() + "+奶油";
    }
}
