package C_8_1;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020Äê7ÔÂ21ÈÕÉÏÎç9:16:32
=======
 * @Data: 2020å¹´7æœˆ21æ—¥ä¸Šåˆ9:16:32
>>>>>>> 6338326... first_commit
 * @File_Name: JVMDemo.java
 * 
 */
class Person{

	@Override
	protected void finalize() throws Throwable {
<<<<<<< HEAD
		System.out.println("À¬»ø»ØÊÕÆ÷Ö´ÐÐ");
=======
		System.out.println("åžƒåœ¾å›žæ”¶å™¨æ‰§è¡Œ");
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
