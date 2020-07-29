package C_4;

/**
 * @author: Gino
 * @Data: 2020年6月28日上午10:45:10
 * @File_Name: Singleton2.java
 * 
 */
//延迟加载  懒汉式加载
public class Singleton2 {
	private static Singleton2 s = null;
	private Singleton2() {
		
	}
	public static Singleton2 getInstance() {
		if(s == null) {
			s = new Singleton2();
		}
		return s;
	}
}
