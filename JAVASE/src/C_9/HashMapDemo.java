package C_9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 1 Aug 202011:06:53
 * @File_Name: HashMapDemo.java
 * 
 */
public class HashMapDemo {
	
	@Test
	public void testHashMap() {
		Map map = new HashMap();
		map.put("1", "aa");
		map.put("2", "bb");
		map.put("3", "cc");
		map.put("1", "ww");//key唯一，否则会覆盖原数据，相当于更新
		map.put("4", "aa");
//		System.out.println(map.size());
		Object obj = map.get("1");
		System.out.println(obj);
		map.remove("2");//根据key删除元素
		System.out.println(map);
	}
	
	//HashMap循环迭代方式
	@Test
	public void testHashMap1() {
		Map map = new HashMap();
		map.put("1", "aa");
		map.put("2", "bb");
		map.put("3", "cc");
		
		//1.key循环
		System.out.println("键----值");
		Set keySet = map.keySet();//返回key的集合
		Iterator it = keySet.iterator();
		while(it.hasNext()) {
			Object next = it.next();
			String key = (String)next;
			System.out.print(key + "----");
			Object value = map.get(key);
			System.out.println(value);
		}
		
		System.out.println("---------------");
		
		//2.整体循环
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
	
}
