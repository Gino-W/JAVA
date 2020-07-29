package C_5;

/**
 * @author: Gino
 * @Data: 2020年7月9日下午8:17:23
 * @File_Name: WrapperDemo2.java
 * 
 */
public class WrapperDemo2 {
	public static void main(String[] args) {
		int i1 = 1;
		//1.自动装箱
		Integer i2 = i1;
		//2.手动装箱
		Integer i3 = new Integer(i1);
		System.out.println("int类型i1=" + i1);
		System.out.println("自动装箱，Integer类型对象i2=" + i2);
		System.out.println("手动装箱，Integer类型i3=" + i3);
		
		//自动拆箱
		int i4 = i2;
		//手动拆箱
		int i5 = i2.intValue();
		System.out.println("自动拆箱，int类型i4=" + i4);
		System.out.println("手动拆箱，int类型i5=" + i5);
	}

}
