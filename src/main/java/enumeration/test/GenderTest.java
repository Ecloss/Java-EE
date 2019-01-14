package enumeration.test;

import enumeration.demo1.Gender;
import org.junit.Test;

/**
 *  @author  Elcoss
 *  @date   2018/7/12
 */
public class GenderTest {

    @Test
    public void test01( ){
        Gender.MALE.info();
        Gender.FEMALE.info();
    }

}
