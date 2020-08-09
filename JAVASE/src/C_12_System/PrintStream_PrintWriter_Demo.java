package C_12_System;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 7 Aug 202010:03:32
 * @File_Name: PrintStream_Demo.java
 * 
 */
public class PrintStream_PrintWriter_Demo {

	//字节打印流
	@Test
	public void testPrintStream() throws IOException{
		PrintStream ps = new PrintStream("..\\Practice\\printstream.txt");
//		ps.write(255);	//按照码表转换后输出	只显示低八位
		ps.print(97);	//原样输出
		ps.println();
		ps.print("a");
		
		ps.flush();
		ps.close();		
	}
	
	
	//字符打印流
	@Test
	public void testPrintWriter() throws IOException {
		OutputStream os = System.out;
		PrintWriter pw = new PrintWriter(os);
		pw.print("a");
		pw.flush();
		pw.close();
		
	}
}
