package C_8_10;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020��7��21������4:30:28
=======
 * @Data: 2020年7月21日下午4:30:28
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
		// TODO Auto-generated method stub
<<<<<<< HEAD
		System.out.println("����������ִ��");
=======
		System.out.println("垃圾回收器执行");
>>>>>>> 6338326... first_commit
	}
	
}