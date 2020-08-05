package C_12;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author: Gino
 * @Data: 5 Aug 202018:10:06
 * @File_Name: IO_WriterAndReaderExample.java
 * 
 */
public class IO_WriterAndReaderExample {
	public static void main(String[] args) throws IOException {
		//源文件
		File sourceFile = new File("..\\Practice\\a.txt");
		
		
		//目标文件
		File targetFile = new File("..\\Practice\\xx\\a_copy.txt");
		
		//建立读取流通道
		FileReader fr = new FileReader(sourceFile);
		
		//建立写入流通道
		FileWriter fw = new FileWriter(targetFile);
		
		//建立临时缓冲区
		char[] c = new char[1024];
		
		//记录读取的字符个数
		int len = 0;
		while((len = fr.read()) != 1) {
			fw.write(c, 0, len);
			fw.flush();
		}
		fr.close();
		fw.close();
	}

}
