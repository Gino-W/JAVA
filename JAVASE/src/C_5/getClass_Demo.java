package C_5;

/**
 * @author: Gino
 * @Data: 2020年7月8日下午5:09:54
 * @File_Name: getClass_Demo.java
 * 
 */
public class getClass_Demo {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Class<? extends Person> class1 = p1.getClass();
		Class<? extends Person> class2 = p2.getClass();
		System.out.println(class1);
		System.out.println(class1.equals(class2));
	}

}
