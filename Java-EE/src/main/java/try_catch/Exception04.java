package try_catch;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class Exception04 {

    /**
     * 合法
     * @throws IOException
     */
    void method1( ) throws IOException{};

    /**
     *  编译错误，必须捕获或抛出IOException
     */
    void method2( ) throws IOException {
        method1();
    }

    /**
     *  合法，声明抛出IOException
     * @throws IOException
     */
    void method3( ) throws IOException {
        method1();
    }

    /**
     * 合法，声明抛出Exception，IOException是Exception的子类
     * @throws Exception
     */
    void method4( ) throws Exception{
        method1();
    }

    /**
     *  合法，捕获IOException异常
     */
    @Test
    void method5( ) {
        try {
            method1();
        } catch (IOException e) {
            System.out.println("IOException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("finally");
        }
    }

    /**
     *  编译错误，必须捕获或者声明抛出Exception
     */
    void method6( ) throws IOException {
        try {
            method1();
        } catch (IOException e) {
            throw new IOException();
        }
    }

    void method7( ) throws Exception {
        try {
            method1();
        } catch (Exception e) {
            throw new Exception();
        }
    }

    void method8( ) throws Exception {
        try {
            method1();
        } catch (IOException e) {
            throw new Exception();
        }
    }

}
