package Encode;

import java.io.UnsupportedEncodingException;

/**
 * @author: Gino
 * @Data: 7 Aug 202019:27:49
 * @File_Name: EncodeDemo.java
 * 
 * 
 * 编码：字符串-->字节数组   
 * 
 * 解码：字节数组-->字符串
 * 
 */
public class EncodeDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "中国";
		//编码
		byte[] b = str.getBytes("gbk");//欧洲的码表不支持中文
		//解码
		String newString = new String(b,"gbk");
		System.out.println(newString);
	}

}