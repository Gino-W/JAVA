package C_8_5;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020��7��21������3:25:11
=======
 * @Data: 2020年7月21日下午3:25:11
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
		System.out.println("����������ִ��");
=======
		System.out.println("垃圾回收器执行");
>>>>>>> 6338326... first_commit
	}
	
}