package C_8;

/**
 * @author: Gino
 * @Data: 2020年7月20日上午11:43:41
 * @File_Name: ThreadCommunication.java
 * 
 */
public class ThreadCommunication {
	public static void main(String[] args) {
		//内部类访问外部局部变量，外部局部变量需要被final修饰
		final Object o = new Object();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (o) {
					//线程任务
					System.out.println("A1");
					//等待
					try {
						Thread.sleep(100);//sleep时不释放锁
						o.wait();//wait时释放锁
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("A2");
					System.out.println("A3");
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (o) {
					//线程任务
					System.out.println("B1");
					System.out.println("B2");
					System.out.println("B3");
					o.notify();//唤醒对方
				}
			}
		}).start();
	}
}
