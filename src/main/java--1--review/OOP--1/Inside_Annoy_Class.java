/**
 * 匿名内部类
 * 前提：内部类需要继承或者实现外部的类或者接口。
 * 格式：new 父类or接口名(){定义子类成员或者覆盖父类方法}.方法。
 * 匿名内部类其实就是一个子类对象。
 *
 * @author 余修文
 * @date 2018/9/13 10:04
 */
abstract class Demo01 {
    abstract void show();
}

class Outer01 {
    private int num = 4;

    public void method() {
        new Demo01() {
            @Override
            void show() {
                System.out.println("show..." + num);
            }
        }.show();
    }
}

public class Inside_Annoy_Class {

    public static void main(String[] args) {
        new Outer01().method();
    }

}
