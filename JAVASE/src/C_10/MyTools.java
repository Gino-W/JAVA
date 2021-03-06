package C_10;

/**
 * @author: Gino
 * @Data: 3 Aug 202011:43:12
 * @File_Name: MyTools.java
 * 
 */

/*public class MyTools {
	private Object obj;


	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
}*/

/**
 * 1.泛型可以用在类中
 * 2.泛型可以用在方法上
 * 3.泛型可以用在返回值上
 * 4.当方法是静态的，不能访问类上定义的泛型，如果静态方法要使用这个泛型，只能将泛型定义在方法上
 */
public class MyTools<W,Q> {
	private W obj;

	public W getObj() {
		return obj;
	}
	public void setObj(W obj) {
		this.obj = obj;
	}
	
	public <Q> void show(Q q){
		int i;
	}
	
	public static <U,Y> void run(U u, Y y) {
		
	}
	
	public static void main(String[] args) {
//		MyTools<String> mt = new MyTools<String>();	//含静态方法会报错
//		mt.setObj("a");
//		String obj2 = mt.getObj();
//		System.out.println(obj2);
	}
}