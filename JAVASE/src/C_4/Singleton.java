package C_4;



/**
 * @author: Gino
 * @Data: 2020年6月25日
 * @File_Name: Singleton.java
 *
 * 		单例设计模式(饿汉式模式，立即加载)
 * 
 * 		怎样保证对象只有一个？
 * 			1.不让其他人new对象    ----加private关键字
 * 			2.对外提供一个公共方法，供别人调用来完成创建对象这个操作，
 * 		   	    不能创建对象，只能用类名.方法来调用，加static关键字
 * 			3.在本类中创建一个实例
 */
//立即加载  饿汉式模式
class Singleton {
	/**
	 * 相当于main函数中的创建对象
	 * 局部变量上升为成员变量
	 * 例如：
	 * 		public static void main(String[] args){
	 * 			Singleton s = new Singleton();
	 * 		}
	 */
	private static Singleton s = new Singleton();
	
	
	public static Singleton getSingleton() {
		return s;
	}
	
	private Singleton(){
		
	}
}
