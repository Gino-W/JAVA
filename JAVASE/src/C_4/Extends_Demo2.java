package C_4;

/**
 * @author: Gino
 * @Data: 2020年6月29日上午9:11:37
 * @File_Name: Extends_Demo2.java
 *
 */

class Fu{
	int age = 45;
	void talk() {
		System.out.println(age + "爸爸会讲中文");
	}
}

class Zi extends Fu{
	int age = 18;
	void show() {
		System.out.println(super.age + "儿子会讲中文");
	
	}
}


public class Extends_Demo2 {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.talk();
		z.show();
		System.out.println(new Zi().age);
	}

}
