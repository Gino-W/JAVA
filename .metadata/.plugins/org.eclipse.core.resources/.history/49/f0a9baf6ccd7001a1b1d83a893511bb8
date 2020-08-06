package C_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author: Gino
 * @Data: 5 Aug 202016:56:22
 * @File_Name: IO_ReaderDemo.java
 * 
 */
public class IO_FileReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("..\\Practice\\a.txt");
//		int read1 = fr.read();
//		System.out.println(read1);
//		int read2 = fr.read();
//		System.out.println(read2);
		int len = 0;
		while((len = fr.read()) != -1) {
			//  \r 13 		\n 10
			System.out.println(len);
//			System.out.println((char)len);
		}
		fr.close();
	}

}
