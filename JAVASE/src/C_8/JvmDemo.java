package C_8;

/**
 * @author: Gino
 * @Data: 2020年7月15日下午6:54:59
 * @File_Name: JvmDemo.java
 * 
 */

class Person{

	@Override
	protected void finalize() throws Throwable {
		System.out.println("垃圾回收器执行");
	}
	
}

public class JvmDemo {
	public static void main(String[] args) {
		new Person();
		new Person();
		new Person();
		System.gc();	//调用垃圾回收器
		System.out.println("Hello Jvm");
	}

}
