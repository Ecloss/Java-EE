/**
 * 多态函数
 *  多态在程序中的体现：父类的引用或者接口的引用指向了子类的对象。
 *  多态的好处：提高了代码的扩展性。
 *  多态的弊端：不能使用子类的特有方法。(即访问的局限性)
 *
 * @author 余修文
 * @date 2018/9/12 14:47
 */
abstract class Animal {
    public abstract void eat();
}

/**
 * 狗🐶继承了动物的特称
 */
class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("bone");
    }

    public void lookHome() {
        System.out.println("look home");
    }
}

/**
 * 猫🐱继承了动物的特征
 */
class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("fish");
    }

    public void catchMouse() {
        System.out.println("catch mouse");
    }
}

class Pig extends Animal {
    @Override
    public void eat() {
        System.out.println("Si Liao");
    }

    public void sleep() {
        System.out.println("Sleep");
    }
}

public class Ploy_Func {

    /**
     * 向上转型好处：隐藏了子类型，提高了代码的扩展性。

       向上转型弊端：只能使用父类中的功能，不能使用子类特有功能。功能被限定了。

       如果不需要面对子类型，通过提高扩展性，或者使用父类的功能即可完成操作，就使用向上转型。

       向下转型好处：可以使用子类型的特有功能。

       向下转型弊端：面对具体的子类型。向下转型有风险。容易发生ClassCastException。只要转换类型和对象类型不匹配就会发生。想要安全，必须要进行判断。
     *
     * @param args
     */
    public static void main(String[] args) {
        // 向上造型， 创建的Dog对象向上转换为Animal
        Animal a = new Dog();
        a.eat();
        if( !(a instanceof Dog) ) {
            System.out.println("类型不匹配");
            return;
        }
        // 向下造型， 创建的Animal 向下转换为 Dog
        Dog d = (Dog) a;
        d.eat();
        d.lookHome();
        if(d instanceof Dog) {
            System.out.println("类型匹配");
        }
    }

}
