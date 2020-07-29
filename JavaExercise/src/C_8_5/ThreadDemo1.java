package C_8_5;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020Äê7ÔÂ21ÈÕÏÂÎç3:26:19
=======
 * @Data: 2020å¹´7æœˆ21æ—¥ä¸‹åˆ3:26:19
>>>>>>> 6338326... first_commit
 * @File_Name: ThreadDemo1.java
 * 
 */
public class ThreadDemo1 {

}

class Student{
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}
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
