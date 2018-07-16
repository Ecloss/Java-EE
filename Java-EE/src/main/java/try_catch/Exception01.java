package try_catch;

public class Exception01 {

    public static void main(String[] args) {

        int a = 5, b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0，程序出现异常");
        }

    }

}
