package C_8_2;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020��7��21������1:40:18
=======
 * @Data: 2020年7月21日下午1:40:18
>>>>>>> 6338326... first_commit
 * @File_Name: ThreadDemo1.java
 * 
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
<<<<<<< HEAD
		Student t1 = new Student("����");
		Student t2 = new Student("����");
		t1.run();
		t2.run();
		for(int j=1; j<=20; j++) {
			System.out.println("�������˵�" + j + "Ȧ");
=======
		Student t1 = new Student("张三");
		Student t2 = new Student("李四");
		t1.run();
		t2.run();
		for(int j=1; j<=20; j++) {
			System.out.println("王五跑了第" + j + "圈");
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
			System.out.println(name +"���˵�" + i + "Ȧ");
=======
			System.out.println(name +"跑了第" + i + "圈");
>>>>>>> 6338326... first_commit
		}
	}
}