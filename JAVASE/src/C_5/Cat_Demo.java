package C_5;

/**
 * @author: Gino
 * @Data: 2020年7月6日下午5:29:03
 * @File_Name: Cat_Demo.java
 * 
 */
abstract class Animal{
	abstract void eat();
}

class Cat extends Animal{

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat喵喵吃饭");
	}
	
	void CatchMouse() {
		System.out.println("Cat Catch Mouse");
	}
}



public class Cat_Demo {
	public static void main(String[] args) {
		Animal a = new Cat();//向上转型
		a.eat();
		Cat c = (Cat)a;//向下转型
		c.CatchMouse();
		
		if(a instanceof Cat) {
			Cat cat = (Cat)a;
			cat.CatchMouse();
		}else {
			System.out.println("转型失败");
		}
	}

}
