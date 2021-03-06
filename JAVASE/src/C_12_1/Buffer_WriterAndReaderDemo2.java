package C_12_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author: Gino
 * @Data: 6 Aug 202017:45:19
 * @File_Name: Buffer_WriterAndReaderDemo2.java
 * 
 */
public class Buffer_WriterAndReaderDemo2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = null;
		BufferedWriter bfw = null;
		try {
			bfr = new BufferedReader(new FileReader(new File("..\\Practice\\China.txt")));
			bfw = new BufferedWriter(new FileWriter(new File("..\\Practice\\xx\\China_copy.txt")));
			String line = null;
			while((line = bfr.readLine()) != null) {
				bfw.write(line);
				bfw.newLine();//换行
				bfw.flush();
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bfr != null) {
				bfr.close();				
			}
			if(bfw != null) {
				bfw.close();								
			}
		}
	}
}
