package reflect;

public class Foo {

    public void hi() {
        System.out.println("Hi");
    }

    /**
     *
     * @param x
     * @param y
     */
    public void bu(int x, int y) {
        System.out.println(x + y);
    }

    private String demo(String name, int age) {
        return name + "  " + age;
    }


    private int demo1(String name, int age) {
        return age;
    }

}
