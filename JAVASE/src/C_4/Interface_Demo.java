package C_4;

import java.util.Scanner;

/**
 * @author: Gino
 * @Data: 2020年7月3日上午11:12:08
 * @File_Name: Interface_Demo.java
 * 
 */

interface A{
	public static final String name = "Gino";
	public abstract void eat();
}

interface B{
	public static final int age = 18;
	public abstract void study();
}
interface C extends A,B{
	
}

class MyQQ{
	void num() {
		System.out.println("请输入账号：");
		Scanner scan = new Scanner(System.in);
		String i = scan.next();
		if("180656245".equals(i)) {
			System.out.println("登陆成功");
		}else {
			System.out.println("登陆失败");
		}
	}
}

class QQ extends MyQQ implements C{
	static MyQQ m = new MyQQ();
	static QQ q = new QQ();
	
	
	@Override
	public void eat() {
		System.out.println(name + "帅");
	}

	@Override
	public void study() {
		System.out.println(name + age + "学习");
	}
	
}

public class Interface_Demo {
	public static void main(String[] args) {
		QQ.m.num();
		
	}
}
