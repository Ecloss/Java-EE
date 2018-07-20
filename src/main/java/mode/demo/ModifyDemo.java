package mode.demo;

import mode.modifer.Bread;
import mode.modifer.Cream;
import mode.modifer.Food;
import mode.modifer.Vegetable;

/**
 * 修饰者模式测试
 *
 * @author Ecloss
 */
public class ModifyDemo {

    public static void main(String[] args) {
        Food food = new Bread(new Vegetable(new Cream(new Food("香肠"))));
        System.out.println(food.make());
    }

}
