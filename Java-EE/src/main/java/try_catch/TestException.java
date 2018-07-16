package try_catch;

public class TestException {

    static int quotient(int x, int y) throws MyException {
        //定义方法抛出异常
        if (y < 0) {
            throw new MyException("除数不能是负数");
        }
        return x/y;
    }

    public static void main(String[] args) {

        int a = 3;
        int b = 1;
        try {
            int result = quotient(a, b);
            System.out.println(result);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (Exception e) {
            System.out.println("程序发生了其它的异常");

        }
        //System.err(null);
        System.exit(1);
    }

}

class MyException extends Exception {
    String message; //定义String类型变量
    public MyException(String ErrorMessgr) {
        message = ErrorMessgr;
    }

    //  覆盖getMessage( ) 方法
    @Override
    public String getMessage() {
        return message;
    }
}
