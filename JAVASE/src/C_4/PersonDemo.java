package C_4;

class Person extends Exception{
	private String name;
	private int age;
	
	
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
//		try {
//			if(age<0 || age>150 ) {
//				System.out.println("该年龄不合法");
//			}
//		}catch{
//			
//		}
		
		this.age = age;
	}
	
	
	void talk() {
		System.out.println(name + "说话");
	}
}

public class PersonDemo {
	public static void main(String[] args) {
		Person p = new Person();  
		p.setName("XL");
		p.talk();
	}

}
