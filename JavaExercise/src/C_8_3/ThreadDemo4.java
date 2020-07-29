package C_8_3;

/**
 * @author: Gino
<<<<<<< HEAD
 * @Data: 2020Äê7ÔÂ21ÈÕÏÂÎç3:02:25
=======
 * @Data: 2020å¹´7æœˆ21æ—¥ä¸‹åˆ3:02:25
>>>>>>> 6338326... first_commit
 * @File_Name: ThreadDemo4.java
 * 
 */
public class ThreadDemo4 {
	public static void main(String[] args) {
<<<<<<< HEAD
		Cat c = new Cat("Ð¡»Æ");
=======
		Cat c = new Cat("å°é»„");
>>>>>>> 6338326... first_commit
		Thread t = new Thread(c);
		t.start();
		
		for(int i=1; i<=20; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(Thread.currentThread().getPriority()+"----");
<<<<<<< HEAD
			System.out.println("Ö÷º¯ÊýÅÜÁËµÚ" + i + "È¦");
=======
			System.out.println("ä¸»å‡½æ•°è·‘äº†ç¬¬" + i + "åœˆ");
>>>>>>> 6338326... first_commit
		}
	}

}
