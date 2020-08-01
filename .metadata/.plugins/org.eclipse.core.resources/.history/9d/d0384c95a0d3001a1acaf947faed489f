package C_9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 2020年7月26日下午5:21:18
 * @File_Name: IteratorDemo.java
 * 
 */
public class IteratorDemo {
	
	@Test
	public void test() {
		List list = new ArrayList();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		//方式一
		System.out.println("----方式一----");
		for(int i=0; i<list.size(); i++) {
			Object object = list.get(i);
			String str = (String)object;
			System.out.println(str);
		}
		
		//方式二  JDK1.5版本以后的新功能  增强 for循环  目的：单纯地为了查询
		System.out.println("----方式二----");
		for(Object o : list) {
			String str = (String)o;
			System.out.println(str);
		}
		
		//方式三 iterator   迭代器
		System.out.println("----方式三----");
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {		//hasNext()判断有没有下一个
			Object next = iterator.next();		//next()取出这个元素
			String str = (String)next;
			System.out.println(str);			
		}
		
		
	}

}
