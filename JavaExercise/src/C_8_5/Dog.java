package C_8_5;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020Äê7ÔÂ21ÈÕÏÂÎç3:23:54
=======
 * @Data: 2020å¹´7æœˆ21æ—¥ä¸‹åˆ3:23:54
>>>>>>> 6338326... first_commit
 * @File_Name: Dog.java
 * 
 */
public class Dog extends Thread {
	private String name;

	public Dog(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=1; i<=20; i++) {
<<<<<<< HEAD
			System.out.println(name + "ÅÜÁËµÚ" + i + "È¦");
=======
			System.out.println(name + "è·‘äº†ç¬¬" + i + "åœˆ");
>>>>>>> 6338326... first_commit
		}
	}
	
}
