package C_9;

/**
 * @author: Gino
 * @Data: 2020年7月25日上午9:19:10
 * @File_Name: Person.java
 * 
 */
public class Person {
	private String name;
	private int age;
	//空参
	public Person() {
		super();
	}
	//有参
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//对外提供一套方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	@Override
//	public boolean equals(Object obj) {
//		Person p = (Person)obj;
//		if((this.name == p.name) && (this.age == p.age)) {
//			return true;
//		}else {
//			return false;
//		}
//	}
	
	 
}
