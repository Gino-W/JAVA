package C_10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: Gino
 * @Data: 2 Aug 202009:41:24
 * @File_Name: GenericDemo1.java
 * 
 */
public class GenericDemo1 {
	public static void main(String[] args) {
		//泛型
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
//		list.add(new Person("张三",18));
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String str = it.next();
			 System.out.println(str);
		}
		
	}

}
