package C_9;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 29 Jul 202019:11:20
 * @File_Name: TreeSetDemo.java
 * 
 */
public class TreeSetDemo {
	/*
	 * TreeSet:
	 * 		1.存储的对象应该属于同一类
	 * 		2.存储比如String，包装类，都是按照自然排序,自己定义的类会异常
	 * 		3.存储的是自定义对象
	 * 			1).让对象自身具有可比性，对象所在类需要实现Comparable接口
	 * 				如果不实现，会出现类转换异常
	 * 			2).容器本身制定比较规则   Comparator
	 */
	
	//出现异常
	@Test
	public void testTreeSet1() {
		Set set = new TreeSet();
		
		set.add(new Person("张三",20));
		set.add(new Person("李四",20));
		set.add(new Person("王五",19));
		System.out.println(set.size());
		for(Object obj : set) {
			Person p = (Person)obj;
			System.out.println(p.getName());
		}
		
	}
	

	
	//容器本身创建比较器
	@Test
	public void testTreeSet2() {
		//构建一个比较器
//		MyComparator mc = new MyComparator();
//		Set set = new TreeSet(mc);
		//使用匿名内部类自定义比较器
		Set set = new TreeSet(new Comparator() {
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
		set.add(new Person("张三",20));
		set.add(new Person("李四",20));
		set.add(new Person("王五",19));
		System.out.println(set.size());
		for(Object obj : set) {
			Person p = (Person)obj;
			System.out.println(p.getName());
		}
	}
	
	class MyComparator implements Comparator{
		
		/* (non-Javadoc)先按照年龄比较，再按照姓名比较
		 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
		 */
		@Override
		public int compare(Object o1, Object o2) {
			Person p1 = (Person)o1;
			Person p2 = (Person)o2;
			int i = p1.getAge().compareTo(p2.getAge());
			if(i == 0) {
				return p1.getName().compareTo(p2.getName());
			}
			return 0;
		}	
	}

}
