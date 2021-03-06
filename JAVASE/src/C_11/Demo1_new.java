package C_11;

/**
 * @author: Gino
 * @Data: 3 Aug 202021:53:42
 * @File_Name: Demo1_new.java
 * 
 */
public class Demo1_new {
	public static void main(String[] args) {
		Status1 createStatus1 = Status1.CREATE;
		
//		Status1[] values = createStatus1.values();
//		for(Status1 s : values) {
//			System.out.println(s);
//		}
		
		Status1 create = createStatus1.valueOf("CREATE");
		System.out.println(create.getValue());
		
//		System.out.println(createStatus1.getName()+"--->"+createStatus1.getValue());
//		createStatus1.show();
//		
//		
//		info in = Status1.CREATE;
//		in.show();
	}
}

interface info{
	void show();
}


//枚举类
//不能继承其他类。但可以实现接口
enum Status1 implements info{
	//新建状态
	CREATE("新建状态", 0){
		public void show() {
			System.out.println("显示的是新建状态");
		}
	},
	//运行状态
	RUNNABLE("运行状态", 1){
		public void show() {
			System.out.println("显示的是运行状态");
		}
	},
	//阻塞状态
	BLOCK("阻塞状态", 2){
		public void show() {
			System.out.println("显示的是阻塞状态");
		}
	},
	//睡眠状态
	WAITING("睡眠状态", 3){
		public void show() {
			System.out.println("显示的是睡眠状态");
		}
	},
	//消亡状态
	TERMINATED("消亡状态", 4){
		public void show() {
			System.out.println("显示的是消亡状态");
		}
	};
	
	//1.提供类的属性，声明为private final
	//成员变量默认被private final所修饰
	private final String name;
	private final Integer value;
	
	//2.在构造函数中初始化数据
	//构造器默认是private
	private Status1(String name, Integer value) {
		this.name = name;
		this.value = value;
	}
	
	//3.通过公共方法获取属性值
	public String getName() {
		return name;
	}
	public Integer getValue() {
		return value;
	}
	
	/*
	public void show() {
		System.out.println("显示状态");
	}
	*/
	
}

