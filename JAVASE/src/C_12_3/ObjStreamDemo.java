package C_12_3;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 7 Aug 202010:47:04
 * @File_Name: ObjStreamDemo.java
 * 
 */
public class ObjStreamDemo {
	
	@Test
	public void testObjectInputStream() throws IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("..\\Practice\\ObjectOutputStream.txt"));
		//对象的反序列化 
		Object readObject = in.readObject();
		Person p = (Person)readObject;
		System.out.println(p.getName());
		in.close();
	}
	
	
	@Test
	public void testObjectOutputStream() throws IOException {
		//对象的写出流，写到磁盘上
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("..\\Practice\\ObjectOutputStream.txt"));
		//对象序列化
		out.writeObject(new Person("zs",20));
		out.flush();
		out.close();
	}

}
