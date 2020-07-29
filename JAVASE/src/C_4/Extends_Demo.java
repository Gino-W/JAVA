package C_4;

/**
 * @author: Gino
 * @Data: 2020年6月28日下午2:05:46
 * @File_Name: Extends_Demo.java
 * 
 */

class PL{
	String name;
	int age;
}

class Student extends PL{
	void study() {
		System.out.println(name + "学生学习");
	}
}
class Teacher extends PL{
	void  teach() {
		System.out.println(name + "老师教学");
	}
}
public class Extends_Demo {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "ws";
		s.study();
		
	}

}
