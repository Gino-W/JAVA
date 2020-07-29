package Producer_Consumer;

/**
 * @author: Gino
 * @Data: 2020年7月20日下午8:19:12
 * @File_Name: Demo.java
 * 
 */


//店员
class Clerk{
	int bread;	//面包
}

//生产者
class Producer implements Runnable{
	Clerk c;
	public Producer(Clerk c) {
		this.c = c;
	}


	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			synchronized (c) {
				if(c.bread >= 15) {
					//等待
					try {
						c.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else {
					c.bread++;
					System.out.println(Thread.currentThread().getName()+"生产了第"+c.bread+"个面包");
					c.notifyAll();
				}
			}
		}
	}
}

//消费者
class Consumer implements Runnable{
	Clerk c;
	public Consumer(Clerk c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			synchronized (c) {
				if(c.bread <= 0) {
					//等待
					try {
						c.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else {
					System.out.println(Thread.currentThread().getName()+"消费了第"+c.bread+"个面包");
					c.bread--;
					c.notifyAll();
				}
			}
		}
	}
}

public class Demo {
	public static void main(String[] args) {
		//创建一个店员
		Clerk c = new Clerk();
		
		//创建一个生产者
		Producer p = new Producer(c);
		//创建线程
		Thread p1 = new Thread(p);
		Thread p2 = new Thread(p);
		p1.setName("生产者一");
		p2.setName("生产者二");
		//开启线程并执行线程
		p1.start();
		p2.start();
		
		//创建一个消费者
		Consumer con = new Consumer(c);
		//创建线程
		Thread c1 = new Thread(con);
		Thread c2 = new Thread(con);
		c1.setName("消费者一");
		c2.setName("消费者二");
		//开启线程并执行线程
		c1.start();
		c2.start();
	}
}
