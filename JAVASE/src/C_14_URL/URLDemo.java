package C_14_URL;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author: Gino
 * @Data: 10 Aug 202020:29:58
 * @File_Name: URLDemo.java
 * 
 */
public class URLDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://127.0.0.1:8080/UserLogin/web_bg.jpg");
		url.getProtocol();
		url.getFile();
		url.getPort();
		url.getQuery();
		System.out.println(url.getProtocol());
		System.out.println(url.getFile());
		System.out.println(url.getPort());
		System.out.println(url.getQuery());
		
		InputStream openStream = url.openStream();//读取
		
		URLConnection openConnection = url.openConnection();//可读可写
		openConnection.getInputStream();
		openConnection.getOutputStream();
	}

}