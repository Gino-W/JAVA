package C_9;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 2020年7月25日上午9:13:23
 * @File_Name: CollectionDemo.java
 * 
 */
public class CollectionDemo {

	/*
	 * 	Collection常用方法：
	 * 		1.size()判断集合长度
	 * 		2.add(object o)添加元素
	 * 		3.addAll(Collection c)将另外一个集合添加到当前集合中
	 * 		4.clear()清空当前集合中的所有元素
	 * 		5.isEmpty()判断当前集合是否为空
	 * 		6.remove(object o)删除集合中某一个元素，删除成功返回true，否则返回false
	 * 		7.removeAll(Collection c)删除当前集合中的子集合的所有元素
	 * 		8.contains(Object o)判断当前集合是否包含某个元素
	 * 			判断依据：根据元素所在类中的equals方法来进行判断（比较内容，不是地址值）
	 * 			注意：如果存的是自定义类  要求：重写equals方法
	 * 		9.containsAll(Collection c)当前集合中的元素是否包含集合c中的元素
	 * 		10.hashCode() 
	 * 		11.equals() 比较集合中的 所有！元素是否相等
	 * 		12.retainAll(Collection c)求两个集合的交集，并将结果返还给原集合
	 * 		13.toArray()把集合转换为数组对象
	 * 
	 */
	@Test
	public void test1(){
		Collection c = new ArrayList();
		c.add(123);//自动装箱
		c.add("aa");
		c.add(new Person("张三",20));//集合中存对象都是存的地址值
		c.add(new Person("李四",19));
		
		Collection c1 = new ArrayList();
		c1.add(11);
		c1.add("bb");
		
		c.addAll(c1);
//		System.out.println(c.size());
//		System.out.println(c);//查看当前集合中的所有元素
//		c.clear();//清空当前集合中的所有元素
//		System.out.println(c.isEmpty());//判断当前集合是否为空
		
//		boolean flag = c.remove("aa");
//		System.out.println(flag);
//		System.out.println(c);
		
//		c.removeAll(c1);
//		System.out.println(c);
	}
	
	@Test
	public void test2() {
		Collection c = new ArrayList();
		c.add(123);//自动装箱
		c.add("aa");
		c.add(new Person("张三",20));//集合中存对象都是存的地址值
		c.add(new Person("李四",19));
		
//		boolean flag = c.contains("aa");
//		boolean flag = flag1.contains(new Person("张三",20));
//		boolean flag = c.containsAll(c);
//		System.out.println(flag);
//		System.out.println(c.hashCode());//将十六进制的地址值转换为十进制  C_5.Equals_Demo
		
		Collection c1 = new ArrayList();
		c1.add("aa");
		c1.add("bb");
		
//		c.retainAll(c1);
//		System.out.println(c);
		
		Object[] o = c.toArray();
		System.out.println(o);
		for(int i=0;i<o.length;i++) {
			System.out.println(o[i]);
		}
	}
}
