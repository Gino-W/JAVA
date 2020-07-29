package C_3;

class Student{
	String name;
	int age;
	void study() {
		System.out.println( name + age + "学生学习");
	}
	
//	Student(String name , int age){
//		name = this.name;
//		age = this.age;
//	}
}

class Teacher{
	void show(Student s) {
		s.study();
	}
	
	Student getStudent() {
		Student s = new Student();
		return s;
	}
}


public class ClassName_Return {
	public static void main(String[] args) {
	Student s = new Student();
//		s.name = "Gino";
//		s.age = 18;
//		
		Teacher t = new Teacher();
		t.show(s);
		Student student = t.getStudent();
		System.out.println(student);
		System.out.println(s);
	}
}
