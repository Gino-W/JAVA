package C_3;

class phone{
	String color;
	int anjian;
	void run() {
		System.out.println(color + anjian +  "轰轰轰");
	}
}


public class Car {
	public static void main(String[] args) {
		phone c = new phone();
		c.color = "黑色";
		c.anjian = 9;
		c.run();
				
	}

}
