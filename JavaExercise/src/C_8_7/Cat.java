package C_8_7;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020��7��21������3:42:01
=======
 * @Data: 2020年7月21日下午3:42:01
>>>>>>> 6338326... first_commit
 * @File_Name: Cat.java
 * 
 */
public class Cat implements Runnable {
	private String name;
	public Cat(String name) {
		super();
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=20; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
<<<<<<< HEAD
			Thread.currentThread().setName("С��");
			System.out.print(Thread.currentThread().getPriority()+"----");
			System.out.println(name + "���˵�" + i + "Ȧ");
=======
			Thread.currentThread().setName("小黄");
			System.out.print(Thread.currentThread().getPriority()+"----");
			System.out.println(name + "跑了第" + i + "圈");
>>>>>>> 6338326... first_commit
		}
	}
}