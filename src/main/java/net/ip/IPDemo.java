package net.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * IP地址演示对象
 *
 * @author 余修文
 * @date 2018/7/31 20:11
 */
public class IPDemo {

    public static void main(String[] args) throws UnknownHostException {

        /**
         * 演示IP对象
         */
        // 返回本地主机IP地址
        InetAddress ip = InetAddress.getLocalHost();

        // 获取其他主机信息，通过名称（IP字符串 or 主机名） 来获取一个ip对象
        ip = InetAddress.getByName("www.bing.com");

        System.out.println(ip);

        String ip_str = ip.getHostAddress();
        String name = ip.getHostName();
        System.out.println(ip_str + ":" + name);

        System.out.println("---------------------------");

        InetAddress[] ias = InetAddress.getAllByName("www.bing.com");
        for (InetAddress ia : ias) {
            System.out.println(ia);
        }

    }

}
