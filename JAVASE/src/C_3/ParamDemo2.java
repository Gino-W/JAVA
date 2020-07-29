package C_3;

//引用数据类型参数传递

class Person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}





public class ParamDemo2 {
	int a = 5;
	public static void main(String[] args) {
		ParamDemo2 pd = new ParamDemo2();
		pd.a = 10;
		show(pd);
		System.out.println("pd.a=" + pd.a);
	}
	
	public static void show(ParamDemo2 pd) {
		pd.a = 8;
	}
}
