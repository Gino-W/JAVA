package C_12_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author: Gino
 * @Data: 5 Aug 202016:19:52
 * @File_Name: IO_WriterDemo2.java
 * 
 */
public class IO_FileWriterDemo2 {
	public static void main(String[] args){
		FileWriter fileWriter = null;
		try {
			File file = new File("xx:\\b.txt");
			fileWriter = new FileWriter(file,true);
			fileWriter.write(97);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(fileWriter != null) {
					fileWriter.close();					
				}
			} catch (IOException e) {
				//保存到日志
				throw new RuntimeException("流关闭了！赶紧来处理");
			}
		}
	}

}
