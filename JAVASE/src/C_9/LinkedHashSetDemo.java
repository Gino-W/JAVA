package C_9;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 1 Aug 202010:51:09
 * @File_Name: LinkedHashSet.java
 * 
 */
public class LinkedHashSetDemo {
	/*
	 * LinkedHashSet:使用链表来维护一个集合
	 * 	遍历元素:按照元素的添加顺序进行的
	 * 
	 * LinkedHashSet插入的性能略低于HashSet，但是迭代时性能会好一点
	 */
	
	@Test
	public void testLinkedHashSet() {
		Set set = new LinkedHashSet();
		set.add("aa");
		set.add("bb");
		set.add("cc");
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
