package C_8;

/**
 * @author: Gino
 * @Data: 2020年7月17日上午9:06:52
 * @File_Name: Thread_Common.java
 * 
 */
public class Thread_Common {
	/**
	 * Thread常用方法
	 * 		1.start()	启动线程并执行run方法
	 * 		2.run()		线程任务都封装在run方法中
	 * 		3.currentThread()	静态的，获取当前线程的对象引用
	 * 		4.getName()		获取当前线程的名字
	 * 		5.sleep(long 100)		让正在执行的线程睡眠100毫秒
	 * 		6.setName("xx")		设置当前线程的名字
	 * 		7.getPriority()		返回当前线程的优先级
	 * 		8.setPriority(int newPriority)		设置线程优先级		
	 * 		9.join()	主要作用是同步，让并行执行变为串行执行
	 * 		10.interrupt()		线程中断执行
	 * 		11.yield()		当前线程释放当前CPU的执行权,效果不明显，可能被线程调度再次选中
	 * 		12.线程间通信  wait()  notify()    notifyAll()
	 * @param args
	 */
	public static void main(String[] args) {
		Cat c = new Cat("阿黄");
//		new Thread(c).start();
		Thread t = new Thread(c);
		t.start();
		
		for(int i=1; i<21; i++) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//设置优先级
			Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
			
			System.out.print(Thread.currentThread().getName() + "----");
			System.out.println("主函数跑了第" + i + "圈");
		}
	}

}
