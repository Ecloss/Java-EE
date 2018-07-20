package mode.modifer;

/**
 * 食物，作为其它详细食物的父类
 *
 * @author Ecloss
 */
public class Food {

    private String foodName;

    public Food() {
    }

    public Food(String foodName) {
        this.foodName = foodName;
    }

    public String make() {
        return foodName;
    }
}
