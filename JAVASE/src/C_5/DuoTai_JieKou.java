package C_5;

/**
 * @author: Gino
 * @Data: 2020年7月6日下午6:51:35
 * @File_Name: DuoTai_JieKou.java
 * 
 */
class PC{
	void use(USB u) {
		u.open();
		
		if(u instanceof Mouse) {
			Mouse m = (Mouse)u;
			m.Click();
		}else if(u instanceof Key){
			Key k = (Key)u;
			k.Print();
		}else {
			System.out.println("无此设备");
		}
		
		u.close();
	}
}

//键盘和鼠标的相同方法，抽取为接口
interface USB{
	void open();
	void close();
}

class Mouse implements USB{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("连接鼠标");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("断开鼠标");
	}
	
	
	void Click() {
		System.out.println("点击鼠标");
	}
}

class Key implements USB{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("连接键盘");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("断开键盘");
	}
	
	void Print() {
		System.out.println("键盘码字");
	}
}

class Test implements USB{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println();
	}
	
}

public class DuoTai_JieKou {
	public static void main(String[] args) {
		PC pc = new PC();
		pc.use(new Mouse());
		pc.use(new Key());
		pc.use(new Test());
	}

}
