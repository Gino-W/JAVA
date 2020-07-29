package C_9;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 2020年7月27日上午9:32:39
 * @File_Name: VectorDemo.java
 * 
 * 		Vector基本不使用
 */
public class VectorDemo {
	
	@Test
	public void test() {
		Vector v = new Vector();
		v.addElement("aa");
		v.addElement("bb");
		v.addElement("cc");
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			Object n = e.nextElement();
			System.out.println(n);
		}
		
		Iterator it = v.iterator();
		while(it.hasNext()) {
			Object next = it.next();
			System.out.println(next);
		}
	}

}
