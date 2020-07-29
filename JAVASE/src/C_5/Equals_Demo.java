package C_5;

/**
 * @author: Gino
 * @Data: 2020年7月8日上午11:27:44
 * @File_Name: Equals_Demo.java
 * 
 */

class Person{
	String name;
	int age;
	
	Person(){
		super();
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}

public class Equals_Demo {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		//输出p2相当于调用了toString方法
		System.out.println(p2);
		System.out.println(p2.toString());
		//将十六进制的地址值转换为十进制
		System.out.println(p2.hashCode());
		
		System.out.println(p1.equals(p2));
	}

}
