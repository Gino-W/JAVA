package C_8;

/**
 * @author: Gino
 * @Data: 2020年7月15日下午7:08:45
 * @File_Name: ThreadDemo.java
 * 
 */

class Per{
	private String name;

	public Per(String name) {
		super();
		this.name = name;
	}
	
	public void run() {
		for(int i=1; i<=20; i++) {
			System.out.println(name + "跑的第" + i + "圈");
		}
	}
	
}

public class ThreadTest {
	public static void main(String[] args) {
		Per p1 = new Per("张三");
		Per p2 = new Per("李四");
		p1.run();
		p2.run();
		for(int j=1; j<=20; j++) {
			System.out.println("王五跑了第" + j + "圈");
		}
	}

}
