package C_8_2;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020��7��21������1:58:06
=======
 * @Data: 2020年7月21日下午1:58:06
>>>>>>> 6338326... first_commit
 * @File_Name: ThreadDemo3.java
 * 
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
<<<<<<< HEAD
		Cat c1 = new Cat("С��");
		Cat c2 = new Cat("С��");
=======
		Cat c1 = new Cat("小黄");
		Cat c2 = new Cat("小黑");
>>>>>>> 6338326... first_commit
		new Thread(c1).start();
		new Thread(c2).start();
	}
}
