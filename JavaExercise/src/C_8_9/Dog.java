package C_8_9;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020��7��21������4:10:03
=======
 * @Data: 2020年7月21日下午4:10:03
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
		// TODO Auto-generated method stub
		for(int i=1; i<=20; i++) {
<<<<<<< HEAD
			System.out.println(name + "���˵�" + i + "Ȧ");
=======
			System.out.println(name + "跑了第" + i + "圈");
>>>>>>> 6338326... first_commit
		}
	}
	
}
