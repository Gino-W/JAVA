package C_4;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = {13,43,64,785,346,734,83,349};
		//ArrayTools M = new ArrayTools();
		int max = ArrayTools.getMax(arr);	//类名.方法
		
		//ArraySub(2,1);
	}
	
	
	public  static void ArraySub(int a , int b) {
		int x = a - b;
		System.out.println(x);
	}

}
