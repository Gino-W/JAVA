package Synchronized_Demo;

/**
 * @author: Gino
 * @Data: 2020年7月19日下午2:58:42
 * @File_Name: Synchronized_Test.java
 * 
 * 		同步方法(二)：
 * 			Synchronized放在方法声明中，表示整个方法为同步方法
 * 
 * 		注意：
 * 			方法没有static修饰时，用的是synchronized(this)
 * 			方法中有static修饰时，用的是synchronized(this.getClass())
 */

class Test3 extends Thread{
	private static int a = 100;

	@Override
	public void run() {
		while(true) {
			show();
		}
	}
	
	public synchronized static void show() {
		if(a > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"----"+a);
			a--;
		}
	}
}

class Test4 implements Runnable{
	private static int b = 100;

	@Override
	public void run() {
		while(true) {
			show();
		}
	}
	
	public synchronized static void show() {
		if(b > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"----"+b);
			b--;
		}
	}
}

public class Synchronized_Test_2 {
	public static void main(String[] args) {
		//继承Thread，创建Thread子类实例对象
//		Test3 t1 = new Test3();
//		Test3 t2 = new Test3();
//		Test3 t3 = new Test3();
//		t1.setName("窗口一");
//		t2.setName("窗口二");
//		t3.setName("窗口三");
//		t1.start();
//		t2.start();
//		t3.start();
		
		//通过Thread类创建线程对象，并将Runnable接口的子类对象作为Thread类的构造函数参数传递进来,调用线程对象的start方法开启线程
		Test4 t = new Test4();
		Thread e1 = new Thread(t);
		Thread e2 = new Thread(t);
		Thread e3 = new Thread(t);
		e1.setName("窗口一");
		e2.setName("窗口二");
		e3.setName("窗口三");
		e1.start();
		e2.start();
		e3.start();
		
	}

}
