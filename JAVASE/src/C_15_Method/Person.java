package C_15_Method;

/**
 * @author: Gino
 * @Data: 11 Aug 202007:24:07
 * @File_Name: Person.java
 * 
 */
public class Person {
	public String name;
	public Integer age;
	public void playBasketball() {
		System.out.println("打篮球");
	}
	private void run() {
		System.out.println("跑步。。。。");
	}
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
	}
	

}
