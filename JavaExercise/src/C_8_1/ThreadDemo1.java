package C_8_1;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020��7��21������9:18:08
=======
 * @Data: 2020年7月21日上午9:18:08
>>>>>>> 6338326... first_commit
 * @File_Name: ThreadDemo1.java
 * 
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
<<<<<<< HEAD
		Student s1 = new Student("����");
		Student s2 = new Student("����");
		s1.run();
		s2.run();
		for(int j=1; j<=20; j++) {
			System.out.println("�������˵�"+ j + "Ȧ");
=======
		Student s1 = new Student("张三");
		Student s2 = new Student("李四");
		s1.run();
		s2.run();
		for(int j=1; j<=20; j++) {
			System.out.println("王五跑了第"+ j + "圈");
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
			System.out.println(name+"���˵�"+i+"Ȧ");
=======
			System.out.println(name+"跑了第"+i+"圈");
>>>>>>> 6338326... first_commit
		}
	}
}