package C_11;

/**
 * @author: Gino
 * @Data: 3 Aug 202021:33:57
 * @File_Name: Demo1.java
 * 
 */
public class Demo1 {
	public static void main(String[] args) {
		Status create = Status.CREATE;
		System.out.println(create.getName()+"--->"+create.getValue());
	}

}

//枚举类
class Status{
	//描述线程整个生命周期
	
	//1.提供类的属性，声明为private final
	private final String name;
	private final Integer value;
	
	//2.在构造函数中初始化数据
	private Status(String name, Integer value) {
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
	
	//新建状态
	public static final Status CREATE = new Status("新建状态", 0);
	//运行状态
	public static final Status RUNNABLE = new Status("运行状态", 1);
	//阻塞状态
	public static final Status BLOCK = new Status("阻塞状态", 2);
	//睡眠状态
	public static final Status WAITING = new Status("睡眠状态", 3);
	//消亡状态
	public static final Status TERMINATED = new Status("消亡状态", 4);
	
	
}
