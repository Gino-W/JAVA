package C_9;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 2020年7月26日下午4:54:15
 * @File_Name: ListDemo.java
 * 
 */
public class ArrayListDemo {
	/*
	 * List接口：
	 * 		1.存储和读取的顺序一致
	 * 		2.有索引
	 * 		3.有序的，可以重复
	 * 
	 * 独有的方法：
	 * 		void add(int index, Object o)添加
	 * 		Object get(int index)获取
	 * 		Object remove(int index)删除,返回值是将要删除的元素
	 * 		Object set(int index, Object o)更新，返回值是原来的值
	 * 		
	 * 		indexOf(Object o)返回元素o在集合中第一次出现的位置,没有则返回-1
	 * 		lastIndexOf(Object o)返回元素o在集合中最后一次出现的位置没有就返回-1
	 * 		
	 * 		subList(int fromIndex, int toIndex)返回fromIndex-toIndex之间的元素(不包含toIndex)
	 */
	
	@Test
	public void test1() {
		List list = new ArrayList();
		list.add(0, "aa");
		list.add(1, "bb");
		list.add(2, "cc");
		list.add(3, "dd");
		
//		Object o = list.get(0);
//		System.out.println(o);
//		
//		Object s = list.set(0, "ooo");
//		System.out.println(s);
//		System.out.println(list.get(0));
//		
//		Object remove = list.remove(0);
//		System.out.println(remove);
//		
//		System.out.println(list.size());
		
//		int indexOf = list.indexOf("aa");
//		System.out.println(indexOf);
		
//		int lastIndexOf = list.lastIndexOf("ww");
//		System.out.println(lastIndexOf);
		
		List subList = list.subList(1, 3);
		System.out.println(subList);
		
		
	}
}
