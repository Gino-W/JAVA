package C_8_1;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020��7��21������9:16:32
=======
 * @Data: 2020年7月21日上午9:16:32
>>>>>>> 6338326... first_commit
 * @File_Name: JVMDemo.java
 * 
 */
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

public class JVMDemo {
	public static void main(String[] args) {
		new Person();
		new Person();
		new Person();
		System.gc();
		System.out.println("Hello JVM");
	}

}
