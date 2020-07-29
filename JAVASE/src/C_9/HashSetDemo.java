package C_9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 2020年7月27日上午10:05:36
 * @File_Name: HashSetDemo.java
 * 		
 * 		测试编码问题
 */
public class HashSetDemo {
	/*
	 * HashSet特点：
	 * 		1.无序
	 * 		2.唯一（地址值），元素不可重复
	 * 
	 * 当set中添加对象时，首先调用对象的hashCode()方法，计算此对象的哈希值
	 * 这个哈希值决定了这个对象在set集合中的位置，如果这个位置没有对象进行存储
	 * 则这个对象就存储到这个位置，如果这个位置有对象了，再通过调用equals方法进行比较
	 * 如果equals方法比较结果一样，就不再进行存储了，否则，就在下一个位置进行存储（不建议）
	 * 
	 * 一般情况下，我们会保证hashCode和equals一致
	 * 		重写hashCode和equals方法
	 * 
	 */
	@Test
	public void test() {
		Set set = new HashSet();
		set.add(new Person("张三",20 ));
		set.add(new Person("李四",22 ));
		set.add(new Person("王五",25 ));
		System.out.println(set.size());
		
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Object obj = iterator.next();
			Person p = (Person)obj;
			System.out.println(p.getName());
		}
	}

}
