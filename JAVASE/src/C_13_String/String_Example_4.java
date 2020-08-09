package C_13_String;

/**
 * @author: Gino
 * @Data: 8 Aug 202012:38:15
 * @File_Name: String_Example_4.java
 * 
 */
public class String_Example_4 {
	public static void main(String[] args) {
		String str = "  yv bh dh  yu ";
		MyTrim(str);
		System.out.println(str.length());
		
//		str.trim();
	}

	private static void MyTrim(String str) {
		int start = 0;
		int end = str.length();
		while((start<=end) && (str.charAt(start)) == ' ') {
			start++;
		}
		while((start<=end) && (str.charAt(end-1)) == ' ') {
			end--;
		}
		System.out.println(str.substring(start,end));
	}

}