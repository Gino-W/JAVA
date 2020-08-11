package C_15_Method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 11 Aug 202010:01:37
 * @File_Name: MethodDemo.java
 * 
 * 		Declared	获取一切
 */
public class MethodDemo {
	
	@Test
	public void testMethod() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		Person p = new Person();
//		p.playBasketball();
		
		//1.获取字节码文件对象
		Class<?> clazz = Class.forName("C_15_Method.Person");
		//2.
		Method[] methods = clazz.getMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
		}
		
		Method method = clazz.getMethod("playBasketball", null);
		Object obj = clazz.newInstance();
		method.invoke(obj, null);
	}
	@Test
	public void testMethod1() throws Exception {
		Class<?> clazz = Class.forName("C_15_Methos.Person");
		Object newInstance = clazz.newInstance();
		Method declaredMethod = clazz.getDeclaredMethod("playBasketball",null);
		declaredMethod.setAccessible(true);//设置成可以访问的权限（暴力访问）
		declaredMethod.invoke(newInstance, null);
	}

}
