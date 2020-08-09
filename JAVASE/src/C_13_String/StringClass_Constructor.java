package C_13_String;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 7 Aug 202021:10:40
 * @File_Name: StringClass_Custractor.java
 * 
 */
public class StringClass_Constructor {
	
	
	@Test
	public void testConstructor() {
		//1.把字符串转成字符串对象
		String str1 = new String("java");
		
		//2.把字符数组转换为字符串对象
		char[] values = {'j','a','v','a'};
		String str2 = new String(values);
		
		//3.把字符数组中的一部分转为字符串对象
		String str3 = new String(values,1,2);
		
		//4.把字节数组转换为字符串对象
		byte[] bytes = {97,98,99,100};
		String str4 = new String(bytes);
		
		//5.创建字符串对象
		String str5 = "java";
		
		
	}
	
	@Test
	public void testPtactice() {
		String str1 = "java";
		String str2 = "python";
		String str3 = str1 + str2;
		String str4 = "javapython";
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
	}
}
