package C_13_String;

/**
 * @author: Gino
 * @Data: 8 Aug 202011:14:16
 * @File_Name: String_Example_2.java
 * 
 */
public class String_Example_2 {
	public static void main(String[] args) {
		String str = "asdafghaasdasasdasdghjk";
		String str1 = "da";
		sub(str, str1);
	}

	public static void sub(String s1, String s2) {
		int count = 0;
		int start = 0;
		while((start = (s1.indexOf(s2))) != -1) {
			s1 = s1.substring(start + s2.length());
			count++;
		}
		System.out.println(count); ;
	}
	
	

}
