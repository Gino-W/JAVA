package C_8_10;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020��7��21������4:31:36
=======
 * @Data: 2020年7月21日下午4:31:36
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
			System.out.println(name + "���˵�" + i + "Ȧ");
=======
			System.out.println(name + "跑了第" + i + "圈");
>>>>>>> 6338326... first_commit
		}
	}
}