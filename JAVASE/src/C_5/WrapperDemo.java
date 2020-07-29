package C_5;

/**
 * @author: Gino
 * @Data: 2020年7月9日下午7:42:20
 * @File_Name: WrapperDemo.java
 * 
 */
public class WrapperDemo {
	public static void main(String[] args) {
		/**
		 * 		基本数据类型-->字符串
		 * 				1.基本数据类型 + ""
		 * 				2.用String类中的静态方法valueOf
		 * 		
		 * 		字符串-->基本数据类型
		 * 				1.使用包装类中的静态方法
		 * 					int parseInt("123")
		 * 					long parseLong("123")
		 * 					boolean parseBoolean("false")
		 * 					只有character没有对应的parse方法
		 * 				2.如果字符串被integer封装成一个对象
		 * 					可以调用intValue()
		 */
		int i = 8;
		String s = String.valueOf(i);
		System.out.println(s);
		
		String x = "123";
		int y = Integer.parseInt(x);
		System.out.println(y);
		
		Integer a = new Integer("123");
		int intValue = a.intValue();
		System.out.println(intValue);
	}

}
