package C_8_5;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020��7��21������3:21:46
=======
 * @Data: 2020年7月21日下午3:21:46
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

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
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
