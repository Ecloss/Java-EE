package mode.demo;

import mode.proxy.NormalHome;
import mode.proxy.ProxyInterface;
import mode.proxy.WeedingCompany;

/**
 * 测试代理模式
 *
 * @author Ecloss
 */
public class ProxyDemo {

    public static void main(String[] args) {
        ProxyInterface proxy = new WeedingCompany(new NormalHome());
        proxy.marry();
    }

}
