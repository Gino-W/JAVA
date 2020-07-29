package C_3;

//基本数据类型传递

public class ParamDeno {
	public static void main(String[] args) {
		int a = 5;  //a在堆内
		show(a);	//进来后又出去 a不在同一区域 
		System.out.println("a=" + a);
	}
	
	public static void show(int a) {
		a = 8;	//a在栈内
	}

}
