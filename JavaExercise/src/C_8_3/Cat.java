package C_8_3;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020Äê7ÔÂ21ÈÕÏÂÎç2:07:27
=======
 * @Data: 2020å¹´7æœˆ21æ—¥ä¸‹åˆ2:07:27
>>>>>>> 6338326... first_commit
 * @File_Name: Cat.java
 * 
 */
public class Cat implements Runnable {
	private String name;

	public Cat(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=1; i<=20; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
<<<<<<< HEAD
			Thread.currentThread().setName("Ð¡»Æ");
			System.out.print(Thread.currentThread().getPriority()+"----");
			System.out.println(name + "ÅÜÁËµÚ"+ i+ "È¦");
=======
			Thread.currentThread().setName("å°é»„");
			System.out.print(Thread.currentThread().getPriority()+"----");
			System.out.println(name + "è·‘äº†ç¬¬"+ i+ "åœˆ");
>>>>>>> 6338326... first_commit
		}
	}
	

}
