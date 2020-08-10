package C_14;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author: Gino
 * @Data: 9 Aug 202022:05:29
 * @File_Name: IPDemo.java
 * 
 */
public class IPDemo {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress localHost = InetAddress.getLocalHost();
//		System.out.println(localHost.getHostName());
//		System.out.println(localHost.getHostAddress());
		
		InetAddress byName = InetAddress.getByName("www.baidu.com");
//		System.out.println(byName.getHostName());
//		System.out.println(byName.getHostAddress());
//		System.out.println(byName);
		
//		InetAddress[] allByName = InetAddress.getAllByName("www.baidu.com");
//		System.out.println(allByName);
		
		//获取任意域名的所有IP地址对象
		InetAddress[] addresses = InetAddress.getAllByName("www.baidu.com");
        for (InetAddress address : addresses) {
            System.out.println(address.getHostAddress());
        }
		
	}

}
