package C_8;

/**
 * @author: Gino
 * @Data: 2020年7月15日下午7:26:08
 * @File_Name: ThreadDemo1.java
 * 
 * 
 * 	创建线程方式一：
 * 		1.定义一个类，继承Thread类
 * 		2.覆盖Thread类中的run方法
 * 		3.直接创建Thread子类对象实例
 * 		4.调用Start方法开启线程
 */

class Student extends Thread{
	String name;
	public Student(String name) {
		super();
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=1; i<21; i++) {
			System.out.println(name + "跑了第" + i + "圈");
		}
	}
	
	
}

public class ThreadDemo1 {
	public static void main(String[] args) {
		Student s1 = new Student("张三"); 
		Student s2 = new Student("李四");
		s1.start();
		
		//不能重复调用  否则会出现		IllegalThreadStateException抛出以指示线程不处于所请求操作的适当状态
//		s1.start();		
		s2.start();
	}

}
