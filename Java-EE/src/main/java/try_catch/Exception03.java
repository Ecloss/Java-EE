package try_catch;

import org.junit.jupiter.api.Test;

public class Exception03 {

    @Test
    public void test01( ) {
        int i = 0;
        String gerrting[] = {"Hello World !", "Hello World !!", "Hello World !!!"};
        while (i < 4) {
            try {
                System.out.println(gerrting[i++]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("数组下表越界异常");
            }catch (Exception e) {
                System.out.println("Exception");
            }finally {
                System.out.println("-----------------------");
            }
        }
    }

}
