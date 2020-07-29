package C_8_8;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020Äê7ÔÂ21ÈÕÏÂÎç3:58:28
=======
 * @Data: 2020å¹´7æœˆ21æ—¥ä¸‹åˆ3:58:28
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

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
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
			System.out.println(name + "ÅÜÁËµÚ" + i + "È¦");
=======
			Thread.currentThread().setName("å°é»„");
			System.out.print(Thread.currentThread().getPriority()+"----");
			System.out.println(name + "è·‘äº†ç¬¬" + i + "åœˆ");
>>>>>>> 6338326... first_commit
		}
	}
	
}
