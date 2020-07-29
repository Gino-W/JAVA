package C_5;

/**
 * @author: Gino
 * @Data: 2020年7月6日下午7:43:06
 * @File_Name: Inner_Demo.java
 * 
 */


class Computer{
	void use() {
//		Mouse m = new Mouse();
		
		USB m = new USB() {
			@Override
			public void open() {
				// TODO Auto-generated method stub
				System.out.println("插上鼠标");
			}

			@Override
			public void close() {
				// TODO Auto-generated method stub
				System.out.println("拔掉鼠标");
			}
		};
		
		m.open();
//		m.close();
		
		
		new USB() {
			@Override
			public void open() {
				// TODO Auto-generated method stub
				System.out.println("插上鼠标");
			}

			@Override
			public void close() {
				// TODO Auto-generated method stub
				System.out.println("拔掉鼠标");
			}
		}.open();
		
	}
	
	/*
	class Mouse implements USB{
		@Override
		public void open() {
			// TODO Auto-generated method stub
			System.out.println("插上鼠标");
		}
		@Override
		public void close() {
			// TODO Auto-generated method stub
			System.out.println("拔掉鼠标");
		}
		
	}
	*/
}

public class Inner_Demo {
	public static void main(String[] args) {
		Computer cm = new Computer();
		cm.use();
	}

}
