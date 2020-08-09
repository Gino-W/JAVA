package C_13_String;

/**
 * @author: Gino
 * @Data: 8 Aug 202012:18:31
 * @File_Name: String_Example_3.java
 * 
 */
public class String_Example_3 {
	public static void main(String[] args) {
		String str1 = "asdfghjklertyudfgh";
		String str2 = "uiasdfghuyyt";
		String max = getMaxString(str1, str2);
		System.out.println(max);
	}

	private static String getMaxString(String str1, String str2) {
		String max = null;
		String min = null;
		max = str1.length() > str2.length() ? str1 : str2;
		min = str1.length() > str2.length() ? str2 : str1;
		
		
		for(int i=0; i<min.length(); i++) {
			for(int x=0,y=min.length()-i; y!=min.length()+1; x++,y++) {
				String temp = min.substring(x,y);
				if(max.contains(temp)) {
					return temp;
				}
			}
		}
		return null;
	}

}
