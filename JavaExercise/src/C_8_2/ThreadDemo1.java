package C_8_2;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020Äê7ÔÂ21ÈÕÏÂÎç1:40:18
=======
 * @Data: 2020å¹´7æœˆ21æ—¥ä¸‹åˆ1:40:18
>>>>>>> 6338326... first_commit
 * @File_Name: ThreadDemo1.java
 * 
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
<<<<<<< HEAD
		Student t1 = new Student("ÕÅÈý");
		Student t2 = new Student("ÀîËÄ");
		t1.run();
		t2.run();
		for(int j=1; j<=20; j++) {
			System.out.println("ÍõÎåÅÜÁËµÚ" + j + "È¦");
=======
		Student t1 = new Student("å¼ ä¸‰");
		Student t2 = new Student("æŽå››");
		t1.run();
		t2.run();
		for(int j=1; j<=20; j++) {
			System.out.println("çŽ‹äº”è·‘äº†ç¬¬" + j + "åœˆ");
>>>>>>> 6338326... first_commit
		}
	}
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
			System.out.println(name +"ÅÜÁËµÚ" + i + "È¦");
=======
			System.out.println(name +"è·‘äº†ç¬¬" + i + "åœˆ");
>>>>>>> 6338326... first_commit
		}
	}
}