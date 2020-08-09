package C_13_StringBuffer;

import Synchronized_Demo.Synchronized_Test_1;

/**
 * @author: Gino
 * @Data: 9 Aug 202008:15:27
 * @File_Name: StringBuffer.java
 * 
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		/*
		 * StringBuffer：字符串缓冲区
		 * 		用于存储数据的容器
		 * 特点：
		 * 		1.长度可变
		 * 		2.存储不同类型的数据
		 * 		3.最终都要转成字符串进行使用
		 * 		4.可以对字符串进行修改
		 * 
		 * 
		 * 功能：
		 * 		1.添加
		 * 			append(obj)			添加数据
		 * 			insert(index, obj)	指定位置添加
		 * 		2.修改
		 * 			replace(int start, int end, str)修改某一段位置的数据
		 * 			setCharAt(index, char)			修改某个位置的数据
		 * 		3.删除
		 * 			deleteCharAt()		删除单个
		 * 			delete()			删除多个
		 * 		4.查找
		 * 			charAt(index)		查找单个
		 * 			indexOf()			返回首次出现的位置
		 * 			lastIndexOf()		返回最后一次出现的位置
		 * 			lastIndexOf(str, fromIndex)从指定位置开始查，最后一次出现的位置
		 */
		StringBuffer sb = new StringBuffer();
		StringBuffer append = sb.append("a");
		StringBuffer append2 = sb.append("xx");
		
//		StringBuffer append3 = sb.append("aa").append("bb").append("cc").append("dd");
//		sb.insert(0, "llllllllll");
//		System.out.println(sb);
//		System.out.println(append == append2);
//		System.out.println(append2);
		
		sb.replace(0, 2, "wsdfg");
//		System.out.println(sb);
		sb.setCharAt(2, 'L');
//		System.out.println(sb);
		
		sb.deleteCharAt(2);
		sb.delete(0, 1);
//		System.out.println(sb);
		
		sb.charAt(3);
		System.out.println(sb);
		int indexOf = sb.indexOf("g");
		System.out.println(indexOf);
		sb.lastIndexOf("g");
		sb.lastIndexOf("g", 0);
	}
	/*
	 * StringBuilder  jdk1.5版本之后出现的，和stringbuffer功能一样
	 * 不同：
	 * 		StringBuffer	线程安全的，勇于多线程
	 * 		StringBuilder   线程不安全的，用于单线程
	 */
}

class StringBuilder{
	public synchronized StringBuilder append(String str) {
		return null;
	}
	public synchronized StringBuilder delete(String str) {
		return null;
	}
}
