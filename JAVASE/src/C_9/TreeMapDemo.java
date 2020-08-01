package C_9;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 1 Aug 202012:37:15
 * @File_Name: TreeMapDemo.java
 * 
 * 		TreeMap按照key排序
 * 
 */
public class TreeMapDemo {
	
	@Test
	public void testTreeMap() {
		Map map = new TreeMap();
		map.put("a1", "aa");
		map.put("e1", "bb");
		map.put("c1", "cc");
		
		
		Set keySet = map.keySet();
		Iterator it = keySet.iterator();
		while(it.hasNext()) {
			Object next = it.next();
			String key = (String)next;
			System.out.print(key + "----");
			Object value = map.get(key);
			System.out.println(value);
		}
		
		System.out.println("------------------------------------");
		
		Set entrySet = map.entrySet();
		Iterator iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Object next = iterator.next();
			Map.Entry entry = (Map.Entry)next;
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + "----" + value);
		}
		
	}
	
	@Test
	public void testTreeMap1() {
		Map map = new TreeMap(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Person p1 = (Person)o1;
				Person p2 = (Person)o2;
				int i = p1.getAge().compareTo(p2.getAge());
				if(i == 0) {
					return p1.getName().compareTo(p2.getName());
				}
				return i;
			}
		});
		map.put(new Person("张三",12), "aa");
		map.put(new Person("李四",15), "bb");
		map.put(new Person("王五",19), "cc");
		
		/*
		 * 有异常  解决方法：1.person类实现Comparable接口
		 * 			   2.比较器 重写Comparator方法
		 */
		Set keySet = map.keySet();
		Iterator it = keySet.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Person p = (Person)obj;
			Object value = map.get(p);
			System.out.println(value);
		}
	}
	

}
