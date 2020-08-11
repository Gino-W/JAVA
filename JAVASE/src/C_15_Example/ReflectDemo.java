package C_15_Example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 11 Aug 202010:32:29
 * @File_Name: ReflectDemo.java
 * 
 */
public class ReflectDemo {
	
	@Test
	public void testReflect() throws Exception {
//		Person p = new Person();
//		p.setName("张三");
//		p.setAge(18);
//		p.playBasketball();
		
		
		
		Class<Person> clazz = (Class<Person>) Class.forName("C_15_Example.Person");
		Constructor<Person> c = clazz.getConstructor(null);
		Person p = c.newInstance(null);
		
		Method setNamemethod = clazz.getMethod("setName", java.lang.String.class);
		setNamemethod.invoke(p, "张三");
		
		Method setAgemethod = clazz.getMethod("setAge", Integer.class);
		setAgemethod.invoke(p, 18);
		
		Method m = clazz.getDeclaredMethod("playBasketball", null);
		m.setAccessible(true);
		m.invoke(p, null);
	}

}
