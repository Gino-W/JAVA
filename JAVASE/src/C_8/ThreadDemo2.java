package C_8;

/**
 * @author: Gino
 * @Data: 2020年7月15日下午9:06:50
 * @File_Name: ThreadDemo2.java
 * 
 * 	创建线程方式二：
 * 		1.定义一个类，实现Runnable接口
 * 		2.覆盖接口中的run方法
 * 		3.通过Thread类创建线程对象，并将Runnable接口的子类对象作为Thread类的构造函数参数传递进来
 * 		4.调用线程对象的start方法开启线程
 * 		
 * 		此种方法比较常用
 * 
 * 		实现Runnable接口的好处：
 * 			1.将线程的任务从线程子类中分离出来，进行了单独的封装
 * 			2.避免了java单继承的局限性
 */

class Cat implements Runnable{ 
	private String name;

	public Cat(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=1; i<21; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Thread t = Thread.currentThread();
			System.out.print(t.getName() + "----");
			System.out.println(name + "跑了第" + i + "圈");
		}
	}
	
}

public class ThreadDemo2 {
	public static void main(String[] args) {
//		Cat c1 = new Cat("小黄");
//		Cat c2 = new Cat("小白");
//		new Thread(c1).start();
//		new Thread(c2).start();
		new Thread(new Cat("小白")).start();
	}

}
