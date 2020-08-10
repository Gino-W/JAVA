package C_14_UDP;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author: Gino
 * @Data: 10 Aug 202019:42:33
 * @File_Name: SendDemo.java
 * 
 */
public class SendDemo {
	public static void main(String[] args) throws IOException {
		//创建发送端Socket对象
		DatagramSocket ds = new DatagramSocket();
		
		String data = "你好，ooo";
		byte[] buf = data.getBytes();
		int length = buf.length;
		InetAddress byName = InetAddress.getByName("192.168.56.1");
		int port = 8888;
		//数据包
		DatagramPacket p = new DatagramPacket(buf, length, byName, port);
		//发送数据
		ds.send(p);
		//关闭流对象
		ds.close();
		
	}

}
