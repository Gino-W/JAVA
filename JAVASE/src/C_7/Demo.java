package C_7;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 2020年7月10日下午9:34:28
 * @File_Name: Demo.java
 * 
 */
public class Demo {
	public static void main(String[] args) {
		
		//OutOfMemoryError  内存溢出
//		byte[] b = new byte[1024*1024*2000];
//		System.out.println(b);
		
		//ArithmeticException
//		int i = 1/0;
//		System.out.println(i);
		
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		getWeek(w);
		
	}

	public static void getWeek(int w) {
		
//		int[] x = {1,2,3,4,5,6,7};
//		boolean isContains = Arrays.asList(x).contains(w);
		if(w == 4) {
			System.out.println("今天是周" + w);
		}else {
			throw new RuntimeException("滚犊子，没有");
		}
	}
	
	
	
}


