package TicketSalesDemo2;

/**
 * @author: Gino
 * @Data: 2020年7月17日上午10:47:56
 * @File_Name: Windows_Test.java
 * 
 */

class Window implements Runnable{

	private int ticket = 100;
	
	
//	public Window(String name) {
//		super();
//		Thread.currentThread().setName(name);
//	}

	@Override
	public void run() {
		while(true) {
			//同步代码块
			synchronized (this) {
				if(ticket > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"售票，票号是" + ticket);
					ticket--;
				}else {
					break;
				}
			}
		}
	}
}

public class Windows_Test {
	public static void main(String[] args) {
		Window w = new Window();
		
		Thread w1 = new Thread(w);
		Thread w2 = new Thread(w);
		Thread w3 = new Thread(w);
		
		w1.setName("窗口一");
		w2.setName("窗口二");
		w3.setName("窗口三");
		
		w1.start();
		w2.start();
		w3.start();
		
//		new Thread(new Window("窗口一")).start();;
//		new Thread(new Window("窗口二")).start();;
//		new Thread(new Window("窗口三")).start();;

	}

}
