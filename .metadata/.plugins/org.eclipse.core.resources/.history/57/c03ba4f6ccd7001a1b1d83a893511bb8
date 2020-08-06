package C_12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author: Gino
 * @Data: 5 Aug 202012:20:33
 * @File_Name: IO_WriterDemo.java
 * 
 */
public class IO_FileWriterDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("..\\Practice\\a.txt");
//		System.out.println(file.getAbsolutePath());
		FileWriter fw = new FileWriter(file,true);
		fw.write("\r\naccccccccccccc");
//		fw.flush();//刷新后才能从缓冲区输入进文件
		fw.close();//关闭流自带刷新功能，关闭后写不进去
	}

}
