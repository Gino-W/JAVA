package C_5;

/**
 * @author: Gino
 * @Data: 2020年7月6日下午6:06:15
 * @File_Name: DuoTai_Demo.java
 * 
 */
abstract class Animals{
	abstract void eat();
}

class Duck extends Animals {
	void eat() {
		System.out.println("Duck eating");
	}
	void Ga() {
		System.out.println("GaGa");
	}
}
class Dog extends Animals {
	void eat() {
		System.out.println("Puppy eating");
	}
}


class People{
	void Feeding(Animals a) {
//		a.eat();
		if(a instanceof Duck) {
			Duck d = (Duck)a;
			d.eat();
			d.Ga();
		}else {
			System.out.println("啥也不是");
		}
	}
}
public class DuoTai_Demo {
	public static void main(String[] args) {
		People p = new People();
		p.Feeding(new Duck());
		
		//测试
		p.Feeding(new Dog());
	}

}
