package C_12;

import java.io.File;

/**
 * @author: Gino
 * @Data: 5 Aug 202010:50:52
 * @File_Name: Recursion_File.java
 * 
 */
public class Recursion_File {
	public static void main(String[] args) {
		//列出一个文件夹下所有的子文件夹以及子文件
		File file = new File("..\\Practice\\remove");
//		String[] list = file.list();
//		for(String s : list) {
//			System.out.println(s);
//		}
//		showList(file);
		
		remove(file);
	}

	/**	递归
	 * @param file
	 *		如果是文件，则直接打印文件名字
	 *		如果是文件夹，则继续进入下一级文件夹
	 */
	public static void showList(File file) {
		if(file.isDirectory()) {
			File[] listFiles = file.listFiles();
			for(File f : listFiles) {
				if(f.isFile()) {
					System.out.println("文件：" + f.getName());
				}else if(f.isDirectory()) {
					//这里正在循环的f是文件夹对象
					showList(f);
				}
			}
		}
		System.out.println("文件夹：" + file.getName());
	}
	
	
	public static void remove(File file) {
		if(file.isDirectory()) {
			File[] listFiles = file.listFiles();
			for(File f : listFiles) {
				if(f.isFile()) {
					f.delete();
				}else if(f.isDirectory()) {
					//这里正在循环的f是文件夹对象
					remove(f);
				}
			}
		}
		file.delete();
	}
}
