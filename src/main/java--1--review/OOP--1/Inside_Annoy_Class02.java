/**
 * @author 余修文
 * @date 2018/9/13 10:10
 */
interface Inter {
    void show01( );
    void show02( );
}
class Outer03 {
    private int num = 2;
    public void method( ) {
        Inter in = new Inter() {
            @Override
            public void show01() {
            }

            @Override
            public void show02() {
            }
        };
        in.show01();
        in.show01();
    }
}

interface Inter01 {
    void show01( );
}
class Outer04 {
    public static Inter01 method( ) {
        return new Inter01() {
            @Override
            public void show01() {

            }
        };
    }
}

public class Inside_Annoy_Class02 {

    public static void main(String[ ] args) {
        Outer04.method().show01();
    }

}
