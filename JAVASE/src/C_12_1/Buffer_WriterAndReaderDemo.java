package C_12_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author: Gino
 * @Data: 6 Aug 202017:22:11
 * @File_Name: Buffer_WriterAndReaderDemo.java
 * 
 */
public class Buffer_WriterAndReaderDemo {
	public static void main(String[] args) throws IOException {
		//源文件
		File sourceFile = new File("..\\Practice\\China.txt");
		//建立读取流对象
		FileReader fr = new FileReader(sourceFile);
		//提高读取效率,用缓冲
		BufferedReader bfr = new BufferedReader(fr);
		
		//目标文件
		File targetFile = new File("..\\Practice\\xx\\China_copy.txt");		
		//建立写入流对象
		FileWriter fw = new FileWriter(targetFile);
		//提高写入效率,用缓冲
		BufferedWriter bfw = new BufferedWriter(fw);
		
		//读写操作
		String line = null;
		while((line = bfr.readLine()) != null) {
			bfw.write(line);
			bfw.newLine();//换行
			bfw.flush();
		}
		fr.close();
		bfr.close();
		fw.close();
		bfw.close();
		
		
	}

}
