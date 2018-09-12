/**
 * 接口: 可以理解为特殊的抽象类
 * 接口中的成员都有固定的修饰符：
 * 成员变量：public static final
 * 成员函数：public abstract
 *
 * @author 余修文
 * @date 2018/9/12 14:10
 */
interface Inter1 {
    public static final Integer NUM = 4;
    public abstract void show1( );
    public abstract void show2( );
}

//class Demo implements Inter1 {
//
//    @Override
//    public void show1() {
//
//    }
//
//    @Override
//    public void show2() {
//
//    }
//}

public class InterFace_Func  implements Inter1 {
    @Override
    public void show1() {

    }

    @Override
    public void show2() {

    }
}
