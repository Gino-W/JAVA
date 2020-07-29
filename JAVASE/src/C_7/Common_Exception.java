package C_7;

import java.io.FileInputStream;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 2020年7月13日下午8:54:30
 * @File_Name: Common_Exception.java
 * 
 * 常见的运行时异常
 */
public class Common_Exception {
	
	//java.lang.ArrayIndexOutOfBoundsException  数组下标越界异常
	@Test
	public void Common1() {
		byte[] b = new byte[3];
		System.out.println(b[3]);
	}
	
	//java.lang.ArithmeticException    算数异常
	@Test
	public void Common2() {
		int i = 1/0;
		System.out.println(i);
	}
	
	//java.lang.ClassCastException	类型转换异常
	@Test
	public void Common3() {
		Object o = new String("China");
		Common_Exception c = (Common_Exception)o;
		System.out.println(c);
	}
	
	//java.lang.NullPointerException	空指针异常
	@Test
	public void Common4() {
		String s = new String("aa");
		s = null;
		System.out.println(s.length());
	}
	
	//编译期异常（检查期异常）
	@Test
	public void IOException() {
//		FileInputStream fis = new FileInputStream("aa.txt");
	}

}
