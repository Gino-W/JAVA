package C_8_4;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020Äê7ÔÂ21ÈÕÏÂÎç3:14:47
=======
 * @Data: 2020å¹´7æœˆ21æ—¥ä¸‹åˆ3:14:47
>>>>>>> 6338326... first_commit
 * @File_Name: ThreadDemo1.java
 * 
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
<<<<<<< HEAD
		Student s1 = new Student("ÕÅÈý");
		Student s2 = new Student("ÀîËÄ");
		s1.run();
		s2.run();
		for(int i=1; i<=20; i++) {
			System.out.println("ÍõÎåÅÜÁËµÚ" + i + "È¦");
=======
		Student s1 = new Student("å¼ ä¸‰");
		Student s2 = new Student("æŽå››");
		s1.run();
		s2.run();
		for(int i=1; i<=20; i++) {
			System.out.println("çŽ‹äº”è·‘äº†ç¬¬" + i + "åœˆ");
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
			System.out.println(name + "ÅÜÁËµÚ" + i + "È¦");
=======
			System.out.println(name + "è·‘äº†ç¬¬" + i + "åœˆ");
>>>>>>> 6338326... first_commit
		}
	}
}