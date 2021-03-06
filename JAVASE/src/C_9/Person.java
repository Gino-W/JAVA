package C_9;

/**
 * @author: Gino
 * @Data: 2020年7月25日上午9:19:10
 * @File_Name: Person.java
 * 
 */
public class Person /*implements Comparable*/{
	private String name;
	private Integer age;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//重写equals方法
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		Person p = (Person)obj;
		if(this.age == null) {
			if(p.age != null) {
				return false;
			}
		}else if(!this.age.equals(p.age)) {
			return false;
		}
		if(this.name == null) {
			if(p.name != null) {
				return false;
			}
		}else if(!this.name.equals(p.name)) {
			return false;
		}
		
		return true;
	}
	//重写hashCode方法
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result +((name == null)?0:name.hashCode());
		result = prime * result +((age == null)?0:age.hashCode());
		return result;
	}
	
	
	/*
	//重写compareTo方法
	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		int i = this.age.compareTo(p.age);
		//如果年龄相等则按照姓名排列
		if(i == 0) {
			return this.name.compareTo(p.name);
		}
		return i;
		//按年龄排序，此对象比上一个对象年龄大，正序取，否则逆序取
		if(this.age > p.age) {
			return 1;
		}
		return i;//0代表元素都一样，正整数元素怎么存就怎么取，负整数元素怎么存就逆序取
		return this.age.compareTo(p.age);
		
		if(this.age.compareTo(p.age) == 0) {
			return this.name.compareTo(p.name);
		}
		return this.age.compareTo(p.age);
	}
	*/
	
	
//	@Override
//	public boolean equals(Object obj) {
//		Person p = (Person)obj;
//		if((this.name == p.name) && (this.age == p.age)) {
//			return true;
//		}else {
//			return false;
//		}
//	}

//	@Override
//	public int hashCode() {
//		return 1;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		Person p = (Person)obj;
//		if(this.age != p.age) {
//			return false;
//		}
//		return true;
//	}
	
	
	
	 
}
