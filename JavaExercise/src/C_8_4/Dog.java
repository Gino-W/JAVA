package C_8_4;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020��7��21������3:08:35
=======
 * @Data: 2020年7月21日下午3:08:35
>>>>>>> 6338326... first_commit
 * @File_Name: Dog.java
 * 
 */
public class Dog extends Thread{
	private String name;

	public Dog(String name) {
		super();
		this.name = name;
	}

	@Override
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
