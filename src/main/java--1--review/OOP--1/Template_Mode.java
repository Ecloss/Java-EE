/**
 * 模板方法设计模式
 * 解决的问题：当功能内部一部分实现时确定，一部分实现是不确定的。
 * 这时可以把不确定的部分暴露出去，让子类去实现。
 *
 * @author 余修文
 * @date 2018/9/12 14:00
 */
abstract class GetTime {
    /**
     * 此功能如果不需要重写，可以加final
     */
    public final void getTime() {
        long start = System.currentTimeMillis();
        // 不确定的功能写出去
        code();
        long end = System.currentTimeMillis();
        System.out.println("runtime : " + (end - start) + "  ms");
    }

    public abstract void code();
}

class SubDemo extends GetTime {

    @Override
    public void code() {
        for (int x = 0; x < 1000; x++) {
            System.out.println(x);
        }
    }
}

public class Template_Mode {
    public static void main(String[] args) {
        new SubDemo().getTime();
    }
}
