package TicketSalesDemo1;

/**
 * @author: Gino
 * @Data: 2020年7月17日上午10:30:35
 * @File_Name: TestWindows.java
 * 
 */

class Window extends Thread{
	static int ticket = 100;

	@Override
	public void run() {
		while(true) {
			if(ticket > 0) {
				System.out.println(Thread.currentThread().getName()+"售票，票号是" + ticket);
				ticket--;
			}else {
				break;
			}
		}
	}
	
}

public class Windows_Test {
	public static void main(String[] args) {
		//创建三个窗口
		Window w1 = new Window();
		Window w2 = new Window();
		Window w3 = new Window();
		
		//给三个窗口分别设置名字
		w1.setName("窗口一");
		w2.setName("窗口二");
		w3.setName("窗口三");
		
		//启动三个窗口（线程）
		w1.start();
		w2.start();
		w3.start();
		
		
	}

}
