package C_3;

public class Test_Static {
	public static void main(String[] args) {
		add(9); 	//被static修饰的函数只能调用static函数
	}
	
	public static void add(int a) {
		System.out.println(a);
	}
}
