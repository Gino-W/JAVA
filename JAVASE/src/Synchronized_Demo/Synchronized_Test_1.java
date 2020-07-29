package Synchronized_Demo;

/**
 * @author: Gino
 * @Data: 2020年7月19日下午2:59:48
 * @File_Name: Synchronized_Test2.java
 * 	
 * 		同步机制(1):
 * 			synchronized(对象){
 * 				//需要被同步的代码
 * 			}
 * 
 */

class Test1 extends Thread{
	private static int x = 100;

	@Override
	public void run() {
		while(true) {
			synchronized (this.getClass()) {
				if(x > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"----"+x);
					x--;
				}else {
					break;
				}
			}
		}
	}
}

class Test2 implements Runnable{
	private static int y = 100;
	
	@Override
	public void run() {
		while(true) {
			synchronized (this) {
				if(y > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"----"+y);
					y--;
				}else {
					break;
				}
			}
		}
	}
	
}

public class Synchronized_Test_1 {
	public static void main(String[] args) {
		//创建Thread子类对象实例，然后调用start方法
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		Test1 t3 = new Test1();
		t1.setName("窗口一");
		t2.setName("窗口二");
		t3.setName("窗口三");
		t1.start();
		t2.start();
		t3.start();
		
		//通过Thread类创建线程对象，并将Runnable接口的子类对象作为Thread类的构造函数参数传递进来,调用线程对象的start方法开启线程
//		Test2 e = new Test2();
//		Thread e1 = new Thread(e);
//		Thread e2 = new Thread(e);
//		Thread e3 = new Thread(e);
//		e1.setName("窗口一");
//		e2.setName("窗口二");
//		e3.setName("窗口三");
//		e1.start();
//		e2.start();
//		e3.start();
		
	}

}
