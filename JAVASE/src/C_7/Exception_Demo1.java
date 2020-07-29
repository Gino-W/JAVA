package C_7;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 2020年7月14日上午10:21:13
 * @File_Name: Exception_Demo1.java
 * 
 */
public class Exception_Demo1 {
	@Test
	public void test1() {
		try{
			int i = 1/0;
			System.out.println(i);
		}catch(ArithmeticException e) {
			//产品上线后，将异常信息写入到一个文件中
			System.out.println(e.toString());
//			e.printStackTrace();	//调试阶段常用
			System.out.println(e.getMessage());
		}
		
	}

}
