package C_15_Example;

/**
 * @author: Gino
 * @Data: 11 Aug 202007:24:07
 * @File_Name: Person.java
 * 
 */
public class Person {
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	private void playBasketball() {
		System.out.println(name + age + "岁打篮球");
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
