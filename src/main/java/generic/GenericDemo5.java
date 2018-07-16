package generic;

public class GenericDemo5 {

    public static void main(String[] args) {

        /**
         *  泛型2：泛型方法--> 泛型定义在方法上
         */
        //Demo1<String> d = new Demo1<String>();
        //d.show("abc");
        ////d.print(6);在类上明确类型后，错误参数类型在编译时期就报错。
        //Demo1<Integer> d1 = new Demo1<Integer>();
        //d1.print(6);
        ////d1.show("abc");
        //System.out.println("----------------");
        //
        //Demo2<String> d2 = new Demo2<String>();
        //d2.show("abc");
        //d2.print("bcd");
        //d2.print(6);

    }

    class Demo1<W> {

        public void show(W w) {
            System.out.println("show:  " + w);
        }

        public void print(W w) {
            System.out.println("print:  " + w);
        }
    }

    class Demo2<W> {
        public void show(W w) {
            System.out.println("show: " + w);
        }
        public <Q> void print(Q w) {
            System.out.println("print: " + w);
        }

        public  <A> void staticShow(A a) {
            System.out.println("static show: " + a);
        }

    }

}
