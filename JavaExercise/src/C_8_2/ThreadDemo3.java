package C_8_2;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020Äê7ÔÂ21ÈÕÏÂÎç1:58:06
=======
 * @Data: 2020å¹´7æœˆ21æ—¥ä¸‹åˆ1:58:06
>>>>>>> 6338326... first_commit
 * @File_Name: ThreadDemo3.java
 * 
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
<<<<<<< HEAD
		Cat c1 = new Cat("Ð¡»Æ");
		Cat c2 = new Cat("Ð¡ºÚ");
=======
		Cat c1 = new Cat("å°é»„");
		Cat c2 = new Cat("å°é»‘");
>>>>>>> 6338326... first_commit
		new Thread(c1).start();
		new Thread(c2).start();
	}
}
