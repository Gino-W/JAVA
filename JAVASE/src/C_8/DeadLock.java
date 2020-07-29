package C_8;

/**
 * @author: Gino
 * @Data: 2020年7月20日上午10:46:20
 * @File_Name: DeadLock.java
 * 
 */
public class DeadLock {
	public static String obj1 = new String("obj1");
	public static String obj2 = new String("obj2");
	public static void main(String[] args) {
//		Lock1 lock1 = new Lock1();
//		Lock2 lock2 = new Lock2();
//		
//		Thread t1 = new Thread(lock1);
//		Thread t2 = new Thread(lock2);
//		
//		t1.start();
//		t2.start();
		
		//一个类如果只有1-3个方法，可以使用匿名内部类
//		new Thread(new Lock1()).start();
//		new Thread(new Lock2()).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					synchronized (DeadLock.obj1) {
						System.out.println("A");
						synchronized (DeadLock.obj2) {
							System.out.println("B");
						}
					}
				}
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					synchronized (DeadLock.obj2) {
						System.out.println("C");
						synchronized (DeadLock.obj1) {
							System.out.println("D");
						}
					}
				}
			}
		}).start();

	}
}

//请求与保持
//class Lock1 implements Runnable{
//	@Override
//	public void run() {
//		while(true) {
//			synchronized (DeadLock.obj1) {
//				System.out.println("A");
//				synchronized (DeadLock.obj2) {
//					System.out.println("B");
//				}
//			}
//		}
//	}
//	
//}
//
//class Lock2 implements Runnable{
//	@Override
//	public void run() {
//		while(true) {
//			synchronized (DeadLock.obj2) {
//				System.out.println("C");
//				synchronized (DeadLock.obj1) {
//					System.out.println("D");
//				}
//			}
//		}
//	}
//	
//}