package C_9;

import java.util.Arrays;
import java.util.List;

/**
 * @author: Gino
 * @Data: 1 Aug 202018:44:32
 * @File_Name: ArraysDemo.java
 * 
 */
public class ArraysDemo {
	public static void main(String[] args) {
		String[] str = {"aa","bb","cc"};
		List list = Arrays.asList(str);
		System.out.println(list.get(0));
	}

}
