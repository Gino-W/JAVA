package C_15_Class;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 11 Aug 202007:13:23
 * @File_Name: ClassDemo.java
 * 
 */
/*
 * 反射，在程序运行时。动态地创建一个对象，并调用该对象里面的相关方法
 */
public class ClassDemo {
	
	@Test
	public void testClass() throws ClassNotFoundException {
		//常用方式一
		//1.方式一     类的全限定名，获取字节码文件(Person.class)
		Class clazz1 = Class.forName("C_15_Class.Person");
		System.out.println(clazz1.hashCode());
		
		//2.方式二    通过对象.getClass()获取字节码文件
		Person p = new Person();
		Class clazz2 = p.getClass();
		System.out.println(clazz2.hashCode());
		
		//3.方式三    通过类名.class获取
		Class clazz3 = Person.class;
		System.out.println(clazz3.hashCode());
	}
	
	
	@Test
	public void testClass2() {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		System.out.println(p1.getClass().hashCode());
		System.out.println(p2.getClass().hashCode());
		System.out.println(p3.getClass().hashCode());
	}
}
