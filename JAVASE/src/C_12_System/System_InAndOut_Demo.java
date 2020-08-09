package C_12_System;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

/**
 * @author: Gino
 * @Data: 7 Aug 202009:09:15
 * @File_Name: SystemDemo.java
 * 
 */
public class System_InAndOut_Demo {
	public static void main(String[] args) throws IOException {
		

//		int read = in.read();
//		System.out.println(read);
		
//		int len = 0;
//		while((len = in.read()) != -1) {
//			System.out.println(len);
//			System.out.println((char)len);
//		}
		
		InputStream in = System.in;
		
		//字节流
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		PrintStream out = System.out;
		
		//转换流
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		String line = null;
		while((line = br.readLine()) != null) {
			if("over".equals(line)) {
				break;
			}
			bw.write(line.toUpperCase());
			bw.newLine();
			bw.flush();
		}
		in.close();
		isr.close();
		br.close();
		out.close();
		osw.close();
		bw.close();
	}

}
