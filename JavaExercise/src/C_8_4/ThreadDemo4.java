package C_8_4;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020��7��21������3:18:59
=======
 * @Data: 2020年7月21日下午3:18:59
>>>>>>> 6338326... first_commit
 * @File_Name: ThreadDemo4.java
 * 
 */
public class ThreadDemo4 {
	public static void main(String[] args) {
<<<<<<< HEAD
		Cat c = new Cat("С��");
=======
		Cat c = new Cat("小黄");
>>>>>>> 6338326... first_commit
		Thread t = new Thread(c);
		t.start();
		for(int i=1; i<=20; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(Thread.currentThread().getPriority()+"----");
<<<<<<< HEAD
			System.out.println("���߳����˵�" + i + "Ȧ");
=======
			System.out.println("主线程跑了第" + i + "圈");
>>>>>>> 6338326... first_commit
		}
	}
}
