package try_catch;

public class Try_Catch01 {

    boolean testEx2( ) throws Exception {
        boolean ret = true;
        try {
            int b = 12;
            int c;
            for (int i = 2; i >= -2; i--) {
                //i为0时，抛出了异常，空指针异常      2 1
                c = b / i;
                System.out.println("i=" + i);
            }
            return true;
        } catch (Exception e) {
            //  testEx2, catch exception
            System.out.println("testEx2, catch exception");
            ret = false;
            throw e;
        } finally {
            //  testEx2, finallyl return value=false
            System.out.println("testEx2, finally; return value=" + ret);
            return ret;
        }
    }

    boolean testEx1( ) throws Exception {
        boolean ret = true;
        try {
            //  传来的值为false直接返回, 下面的语句就不在返回了
            ret = testEx2();
            if (!ret) {
                return false;
            }
            System.out.println("testEx1, at the end of try");
            return ret;
        } catch (Exception e) {
            System.out.println("testEx1, catch exception");
            ret = false;
            throw e;
        } finally {
            //  这里为什么会输出这段呢
            //ret = true;
            System.out.println("testEx1, finally; return value=" + ret);
            return ret;
        }
    }

    boolean testEx( ) throws Exception{
        boolean ret = true;
        try {
            //  直接返回false
            ret = testEx1();
        } catch (Exception e) {
            System.out.println("testEx, catch exception");
            ret = false;
            throw  e;
        } finally {
            //int c = 4 / 0;
            System.exit(1);
            //   最后输出：testEx, finally; return value=false
            System.out.println("testEx, finally; return value=" + ret);
            return ret;
        }
    }

    public static void main(String[] args) {
        Try_Catch01 tc = new Try_Catch01();
        try {
            System.out.println(tc.testEx());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Try_Catch01() {
    }
}
