package C_4;

class People{
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
		this.age = age;
	}

	void talk() {
		System.out.println(name + age + "岁才会说话");
	}
	
	//空参构造函数
	People(){
		
	}
	//
	People(String name , int age ){
		this.name = name;
		this.age = age;
		
	}
}

public class ConstructionDemo {
	public static void main(String[] args) {
		People p = new People("ZS",17);
		p.talk();
		int i = p.getAge();
		System.out.println(i);
	}

}
