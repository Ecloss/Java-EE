package modedesign.demo;

import modedesign.singleton.HungrySingle;
import modedesign.singleton.LazySingle;
import modedesign.singleton.LazySingle1;

import java.security.PublicKey;

/**
 * 关于单例模式的测试
 *
 * @author Ecloss
 */
public class Demo01 {

    public static void main(String[] args) {
        //  懒汉模式（线程非安全）
        LazySingle lazySingle = null;
        lazySingle.getInstance();
        //  懒汉模式（县城安全）
        LazySingle1 lazySingle1 = null;
        lazySingle1.getInstance();
        //  饿汉模式
        HungrySingle hungrySingle;
    }

}
