package C_8_3;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020��7��21������2:15:47
=======
 * @Data: 2020年7月21日下午2:15:47
>>>>>>> 6338326... first_commit
 * @File_Name: JVMDemo.java
 * 
 */
public class JVMDemo {
	public static void main(String[] args) {
		new Person();
		new Person();
		new Person();
		System.gc();
		System.out.println("Hello JVM");
	}
}

class Person{

	@Override
	protected void finalize() throws Throwable {
<<<<<<< HEAD
		System.out.println("����������");
=======
		System.out.println("垃圾回收器");
>>>>>>> 6338326... first_commit
	}
	
}
