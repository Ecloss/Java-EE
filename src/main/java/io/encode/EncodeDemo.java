package io.encode;

import java.io.UnsupportedEncodingException;

/**
 * 编码测试
 *
 * @author Ecloss
 */
public class EncodeDemo {

    public static void main(String[] args) throws UnsupportedEncodingException {

        test01();

    }

    public static void test01() throws UnsupportedOperationException, UnsupportedEncodingException {
        String str= "你好";

        //  编码
        byte[] buf = str.getBytes("utf-8");

        //  解码
        String s1 = new String(buf, "utf-8");

        System.out.println("s1 = " + s1);
    }

}
