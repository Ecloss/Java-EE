/**
 * @author 余修文
 * @date 2018/9/12 14:17
 */
class Fu1 {
    void show() {
        System.out.println("Fu1");
    }
}

class Fu2 {
    void show() {
        System.out.println("Fu2");
    }
}

/**
 * Java中不支持多继承， 但是可以实现多个接口
 */
interface InterA {
    public abstract void show();
}

interface InterB {
    public abstract void show();
}

/**
 * 多实现接口
 */
class SubInter implements InterA, InterB {

    @Override
    public void show() {
        System.out.println("Inter show");
    }
}

//class Zi extends Fu1, Fu2 {
//
//}

public class InterFace_Func1 extends Fu1 {

    public static void main(String[] args) {
        SubInter sub = new SubInter();
        sub.show();
    }

}
