package C_11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Gino
 * @Data: 4 Aug 202009:55:06
 * @File_Name: AnnotationDemo.java
 * 
 * 	注解：jdk1.5版本之后出现的新特性
 * 
 * 	@Deprecated				过时
 * 	@Override				重写
 * 	@SuppressWarnings		压缩警告(类上或局部变量)
 * 
 * 		总结：相当于一种标记,可以应用到包,类,属性,方法,参数等地方
 */
public class AnnotationDemo {
	public static void main(String[] args) {
		Person p = new Student();
		p.show();
		Student s = new Student();
		s.run();
		s.runNew();
		
		//压缩警告
		@SuppressWarnings({ "rawtypes", "unused" })
		List list = new ArrayList();
		
	}
}

@MyAnnotation(value="66", arr="a")
class Person{
	
//	public void teach(@MyAnnotation(value = "zs") String name) {
//		
//	}
	
	public void show() {
		System.out.println("人类表演");
	}
}
class Student extends Person{
	@Override
	public void show() {
		System.out.println("学生表演");
	}
	
	@Deprecated
	public void run() {
		System.out.println("学生跑1000米");
	}
	public void runNew(){
		System.out.println("男同学跑1000米，女同学跑800米");
	}
}
