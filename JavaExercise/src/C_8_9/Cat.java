package C_8_9;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020��7��21������4:08:20
=======
 * @Data: 2020年7月21日下午4:08:20
>>>>>>> 6338326... first_commit
 * @File_Name: Cat.java
 * 
 */
public class Cat implements Runnable{
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
