package C_4;

/**
 * @author: Gino
 * @Data: 2020年7月5日下午7:04:05
 * @File_Name: Interface_Demo2.java
 * 
 */

class Peo{
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
	
	void eat() {
		System.out.println("人会吃饭");
	}
	void sleep() {
		System.out.println("人会睡觉");
	}
//使用private修饰不能直接传输数据	
//	Peo(){
//		
//	}
//	Peo(String name, int age){
//		this.name = name;
//		this.age = age;
//	}
}

//定义抽象方法
abstract class Player extends Peo{
	abstract void study();
}
abstract class Teachers extends Peo{
	abstract void teach();
}

interface StudyEnglish{
	void se();
}

//实现方法
class BskPlayer extends Player implements StudyEnglish{
	@Override
	void study() {
		// TODO Auto-generated method stub
		System.out.println("学习扣篮");
	}

	@Override
	public void se() {
		// TODO Auto-generated method stub
		System.out.println("BskPlayer学英语");
	}
}
class BskTeacher extends Teachers{
	@Override
	void teach() {
		// TODO Auto-generated method stub
		System.out.println("教扣篮");
	}
}

public class Interface_Demo2 {
	public static void main(String[] args) {
		BskPlayer bp = new BskPlayer();
		bp.setName("Gino");
		bp.setAge(18);
		bp.study();
		bp.se();
	}
	
}
