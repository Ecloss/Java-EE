package generic;

public class GenericDemo6 {

    public static void main(String[] args) {

        /**
         *  泛型3：泛型接口--> 泛型定义在接口上
         */
        SubDemo d = new SubDemo();
        d.show("abc");

    }
}

interface Inter<T> {
    public void show(T t);
}

class InterImpl<W> implements Inter<W> {

    @Override
    public void show(W w) {
        System.out.println("show:  " + w);
    }
}

 class SubDemo extends InterImpl<String> {

}
