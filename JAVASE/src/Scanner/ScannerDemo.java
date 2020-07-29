package Scanner;

import java.util.Scanner;

/**
 * @author: Gino
 * @Data: 2020年7月3日下午12:01:57
 * @File_Name: ScannerDemo.java
 * 
 */
public class ScannerDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入账号：");
		Scanner scan = new Scanner(System.in);
		String i = scan.next();
		if("180656245".equals(i)) {
			System.out.println("登陆成功");
		}else {
			System.out.println("登陆失败");
		}
			
	}

}
