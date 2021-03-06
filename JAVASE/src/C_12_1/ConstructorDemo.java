package C_12_1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 4 Aug 202017:47:58
 * @File_Name: ConstructorDemo.java
 * 
 */
public class ConstructorDemo {
	/*
	 * File(String pathname)
	 * 		可以把一个存在或不存在的文件（文件目录）封装成一个对象
	 * File(String parent, String child)
	 * File(File parent, String child)
	 */
	@Test
	public void testConstructor() {
//		绝对路径	C:\Users\Desktop\WorkSpace\Practice
		File f1 = new File("..\\Practice\\Test.txt");
		File f2 = new File("");
		
		File f3 = new File("..\\Practice","Test.txt");
		
		File parent = new File("..\\Practice");
		File f4 = new File(parent,"Test.txt");
		File f5 = new File(new File("..\\Practice"),"Test.txt");
		
	}
	
	/*
	 * 创建文件
	 * 		createNewFile() 指定的文件不存在，就创建文件返回true，否则就返回false
	 * 		mkdir()			创建单级文件夹
	 * 		mkdirs()		创建多级文件夹
	 * 删除文件
	 * 		delete() 		删除单个文件或文件夹
	 */
	@Test
	public void testCreateAndDelete() throws IOException {
		File f = new File("..\\Practice\\Test");
//		boolean flag = f.createNewFile();
//		System.out.println(flag);
//		
//		boolean mkdir = f.mkdir();
//		System.out.println(mkdir);
//		
//		boolean mkdirs = f.mkdirs();
//		System.out.println(mkdirs);
		
		boolean delete = f.delete();
		System.out.println(delete);
	}

	/*
	 * 判断
	 * 		exists()		判断文件或文件夹是否存在
	 * 		isDirectory()	判断文件对象是不是一个文件夹
	 * 		isFile()		判断文件对象是不是文件
	 * 		isAbsolute()	判断当前路径是不是绝对路径
	 * 		isHidden()		判断文件是不是隐藏的
	 */
	@Test
	public void testJudgment() {
		File f = new File("..\\Practice\\Test.txt");
//		boolean exists = f.exists();
//		System.out.println(exists);
		
//		boolean directory = f.isDirectory();
//		System.out.println(directory);
		
//		boolean file = f.isFile();
//		System.out.println(file);
		
		boolean absolute = f.isAbsolute();
		System.out.println(absolute);
		
		boolean hidden = f.isHidden();
		System.out.println(hidden);
	}
	
	/*
	 * 获取类方法
	 * 		getAbsolutePath()	获取文件的绝对路径，返回的是路径字符串
	 * 		getAbsoluteFile()	获取文件的绝对路径，返回的是File对象
	 * 		getParentFile()		获取当前路径的父路径，返回的是File对象
	 * 		getParent()			获取当前路径的父路径，以字符串形式返回父路径
	 * 		getPath()			获取当前路径
	 * 		getName()			获取当前文件或文件夹名称
	 * 		lastModified()		获取文件最后修改时间
	 * 		length()			获取文件长度
	 * 		getTotalSpace()		获取分区总大小
	 * 		renameTo(File newFile)	给文件改名字
	 */
	@Test
	public void testGet() {
		File f = new File("..\\Practice\\Test.txt");
		File f1 = new File("..\\Practice\\A.txt");
		
//		String absolutePath = f.getAbsolutePath();
//		System.out.println(absolutePath);
//		
//		File absoluteFile = f.getAbsoluteFile();
//		System.out.println(absoluteFile);
//				
//		String parent = f.getParent();
//		System.out.println(parent);
//		
//		String path = f.getPath();
//		System.out.println(path);
//		
		long totalSpace = f.getTotalSpace();
		System.out.println(totalSpace/1024/1024/1024);
//		
//		String name = f.getName();
//		System.out.println(name);
//		
//		File parentFile = f.getParentFile();
//		System.out.println(parentFile);
//		
		long lastModified = f.lastModified();
		Date d = new Date(lastModified);
		System.out.println(d.toLocaleString());
		System.out.println(lastModified);
//		
//		long length = f.length();
//		System.out.println(length);
		
//		boolean renameTo = f1.renameTo(f);
//		System.out.println(renameTo);
	}
	
	/*
	 * 查询方法
	 * 		list()		以字符串的形式返回当前路径下的所有文件和文件夹
	 * 		listFiles() 以File对象的形式返回当前路径下的所有文件和文件夹
	 */
	@Test
	public void testList() {
		File f = new File("..\\Practice");
		
		String[] list = f.list();
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println(list.length);
		
		File[] listFiles = f.listFiles();
		for(File file : listFiles) {
			System.out.println(file);
		}
		System.out.println(listFiles.length);
	}
	
}
