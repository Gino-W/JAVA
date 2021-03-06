package C_10;

/**
 * @author: Gino
 * @Data: 2 Aug 202009:44:13
 * @File_Name: Person.java
 * 
 */
public class Person implements Comparable<Person>{
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

	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
	}
	/* (non-Javadoc)先比较年龄，再比较名字
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Person p) {
		if(this.age.compareTo(p.getAge()) == 0){
			return this.name.compareTo(p.getName());
		}
		return this.age.compareTo(p.getAge());
	}

}
