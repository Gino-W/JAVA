package C_12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author: Gino
 * @Data: 5 Aug 202018:25:29
 * @File_Name: IO_WriterAndReaderExample2.java
 * 
 */
public class IO_WriterAndReaderExample2 {
	public static void main(String[] args){
		//建立读取流通道
		FileReader fr = null;
		//建立写入流通道
		FileWriter fw = null;
		try {
			//源文件
			File sourceFile = new File("..\\Practice\\a.txt");
			
			
			//目标文件
			File targetFile = new File("..\\Practice\\xx\\a_copy.txt");
			
			fr = new FileReader(sourceFile);
			
			fw = new FileWriter(targetFile);
			
			//建立临时缓冲区
			char[] c = new char[1024];
			
			//记录读取的字符个数
			int len = 0;
			while((len = fr.read()) != 1) {
				fw.write(c, 0, len);
				fw.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fr != null) {					
					fr.close();
				}
			} catch (IOException e) {
				throw new RuntimeException("读取流关闭出问题");
			}
			
			try {
				if(fw != null) {
					fw.close();					
				}
			} catch (IOException e) {
				throw new RuntimeException("输出流关闭出问题");
			}			
		}
		
		
	}

}
