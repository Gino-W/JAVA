package C_12_System;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * @author: Gino
 * @Data: 6 Aug 202019:03:12
 * @File_Name: TransDemo.java
 * 
 */
public class TransDemo {
	public static void main(String[] args) {
		 FileInputStream fis = null;
		//需要转换吗？
		InputStreamReader isr = null;
		//需要提高效率吗？
		BufferedReader br = null;
		
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			fis = new FileInputStream("..\\Practice\\xx.txt");
			 isr = new InputStreamReader(fis,"gbk");
			 br = new BufferedReader(isr);
			 
			 fos = new FileOutputStream("..\\Practice\\xx\\xx_copy.txt");
			 osw = new OutputStreamWriter(fos,"utf-8");
			 bw = new BufferedWriter(osw);
			 
			 String line = null;
			 while((line = br.readLine()) != null) {
				 bw.write(line);
				 bw.flush();
			 }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
		 try {
			fis.close();
		} catch (IOException e) {
			throw new RuntimeException("出问题了");
		}
		 try {
			isr.close();
		} catch (IOException e) {
			throw new RuntimeException("出问题了");
		}
		 try {
			br.close();
		} catch (IOException e) {
			throw new RuntimeException("出问题了");
		}
		 try {
			fos.close();
		} catch (IOException e) {
			throw new RuntimeException("出问题了");
		}
		 try {
			osw.close();
		} catch (IOException e) {
			throw new RuntimeException("出问题了");
		}
		 try {
			bw.close();
		} catch (IOException e) {
			throw new RuntimeException("出问题了");
		}
		}
	}

}
