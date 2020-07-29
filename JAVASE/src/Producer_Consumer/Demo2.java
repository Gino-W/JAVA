package Producer_Consumer;

/**
 * @author: Gino
 * @Data: 2020年7月20日下午8:54:02
 * @File_Name: Demo2.java
 * 
 */

class Clerks{
	int bread;
	
	//生产面包
	public synchronized void add() {
		if(bread >= 15) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			bread++;
			System.out.println(Thread.currentThread().getName()+"生产了第"+bread+"个面包");
			notifyAll();
		}
	}
	//消费面包
	public synchronized void sale() {
		if(bread <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println(Thread.currentThread().getName()+"购买了第"+bread+"个面包");
			bread--;
			notifyAll();
		}
	}
}

class Producers implements Runnable{
	Clerks c;
	public Producers(Clerks c) {
		this.c = c;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//生产面包
			c.add();
		}
	}
}

class Consumers implements Runnable{
	Clerks c;
	public Consumers(Clerks c) {
		this.c = c;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//购买面包
			c.sale();
		}
	}
}

public class Demo2 {
	public static void main(String[] args) {
		Clerks c = new Clerks();
		
		Producers p = new Producers(c);
		Thread p1 = new Thread(p);
		Thread p2 = new Thread(p);
		p1.setName("生产者一");
		p2.setName("生产者二");
		p1.start();
		p2.start();
		
		Consumers con = new Consumers(c);
		Thread c1 = new Thread(con);
		Thread c2 = new Thread(con);
		c1.setName("消费者一");
		c2.setName("消费者二");
		c1.start();
		c2.start();
	}

}
