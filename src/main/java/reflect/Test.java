package reflect;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *  @interfacle 注解
 */
@Retention(RetentionPolicy.RUNTIME)  //  注解，用来声明注解的注解, SOURCE代表只带源代码中有
public @interface Test {

}
