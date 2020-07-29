package C_8_3;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020Äê7ÔÂ21ÈÕÏÂÎç2:15:47
=======
 * @Data: 2020å¹´7æœˆ21æ—¥ä¸‹åˆ2:15:47
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
		System.out.println("À¬»ø»ØÊÕÆ÷");
=======
		System.out.println("åžƒåœ¾å›žæ”¶å™¨");
>>>>>>> 6338326... first_commit
	}
	
}
