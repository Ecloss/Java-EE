package enumeration.test;

import enumeration.demo1.Operation;
import org.junit.Test;

public class OperationTest {

    @Test
    public void test01() {
        System.out.println("6 + 2 = " + Operation.PLUS.calulate(6, 2));
        System.out.println("6 - 2 = " + Operation.MINUS.calulate(6, 2));
        System.out.println("6 * 2 = " + Operation.TIMES.calulate(6, 2));
        System.out.println("6 / 2 = " + Operation.DIVIDE.calulate(6, 2));
    }

}
