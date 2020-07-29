package C_8_1;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020Äê7ÔÂ21ÈÕÉÏÎç9:18:08
=======
 * @Data: 2020å¹´7æœˆ21æ—¥ä¸Šåˆ9:18:08
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
		for(int j=1; j<=20; j++) {
			System.out.println("ÍõÎåÅÜÁËµÚ"+ j + "È¦");
=======
		Student s1 = new Student("å¼ ä¸‰");
		Student s2 = new Student("æŽå››");
		s1.run();
		s2.run();
		for(int j=1; j<=20; j++) {
			System.out.println("çŽ‹äº”è·‘äº†ç¬¬"+ j + "åœˆ");
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
			System.out.println(name+"ÅÜÁËµÚ"+i+"È¦");
=======
			System.out.println(name+"è·‘äº†ç¬¬"+i+"åœˆ");
>>>>>>> 6338326... first_commit
		}
	}
}