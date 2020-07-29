package C_8_8;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020Äê7ÔÂ21ÈÕÏÂÎç4:01:41
=======
 * @Data: 2020å¹´7æœˆ21æ—¥ä¸‹åˆ4:01:41
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
		System.out.println("À¬»ø»ØÊÕÆ÷Ö´ÐÐ");
=======
		System.out.println("åžƒåœ¾å›žæ”¶å™¨æ‰§è¡Œ");
>>>>>>> 6338326... first_commit
	}
	
}