package C_7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 2020年7月13日下午9:13:49
 * @File_Name: IO_Exception.java
 * 
 */
public class IO_Exception {
	@Test
	public void IO() {
		//1.抓
		try {
			FileInputStream fis = new FileInputStream("aa.txt");
			System.out.println("Hello World");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("出问题了" + "\n" + e);
		}finally{
			System.out.println("最终一定要执行的代码");
		}
	}
	
	
	@Test
	public void IO1() throws FileNotFoundException {
		//2.抛
		FileInputStream fis = new FileInputStream("aa.txt");
	
	}

}
