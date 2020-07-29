package C_9;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 2020年7月26日下午7:02:34
 * @File_Name: LinkedListDemo.java
 * 
 * ----链表（方法类似于栈但是仅仅是类似）----
 */
public class LinkedListDemo {
	/*
	 * 方法：
	 * 		1.getFirst()获取第一个位置的元素，但是不会删除
	 * 		2.getLast()获取最后一个位置的元素，但是不会删除
	 * 		3.removeFirst()获取第一个位置的元素，但是会删除
	 * 		4.removeLast()获取最后一个位置的元素，但是会删除
	 */
	@Test
	public void test1() {
		LinkedList list = new LinkedList();
		list.addFirst("aa");
		list.addFirst("bb");
		list.addFirst("cc");
		
		Object removeFirst = list.removeFirst();
		System.out.println(removeFirst);
		System.out.println(list.size());
		System.out.println(list.getFirst());
	}
	
}
