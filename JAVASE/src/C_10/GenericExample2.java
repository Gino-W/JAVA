package C_10;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 3 Aug 202011:29:15
 * @File_Name: GenericExample2.java
 * 
 */
public class GenericExample2 {
	@Test
	public void test() {
		List<Person> PersonList = new ArrayList<Person>();
		List<String> StrList = new ArrayList<String>();
		StrList.add("aa");
		StrList.add("bb");
		StrList.add("cc");
		
//		PersonList.addAll(c); 
//		上限
//		Collection<? extends Person>只能存储Person或Person的子类
//		下限
//		Collection<? super Person>只能存储Person或Person的父类
		//问号为通配符
	}
	
	public void show(List<? extends Person> list) {
		
	}
	public void run(List<? super Person> list) {
		
	}

}
