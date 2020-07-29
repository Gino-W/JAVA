package C_8;

/**
 * @author: Gino
 * @Data: 2020年7月20日上午9:48:27
 * @File_Name: Singleton_Thread_Demo.java
 * 
 */
public class Singleton_Thread_Demo {

}

//饿汉式模式
class Single{
	private static Single s = new Single();
	private Single() {
			
	}
	public static Single getInstance() {
		return s;
	}
}

//懒汉式模式

/*
 * 加入同步是为了解决多线程安全问题
 * 加入双重判断是为了解决效率问题
 */
class Single1{
	private static Single1 s;
	private Single1() {
		
	}
	public static Single1 getInstance() {
		if(s == null) {
			synchronized (Single1.class) {
				if(s == null) {
					s = new Single1();
				}
			}
		}
		return s;
	}
}