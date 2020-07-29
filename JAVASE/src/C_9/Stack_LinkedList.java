package C_9;

import java.util.LinkedList;

/**
 * @author: Gino
 * @Data: 2020年7月26日下午7:40:16
 * @File_Name: Stack.java
 * 
 */
public class Stack_LinkedList {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.add("aa");
		s.add("bb");
		s.add("cc");
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
}
//描述栈这种数据结构
class Stack{
	private LinkedList linkedlist;
	public Stack() {
		linkedlist = new LinkedList();
	}
	
	public void add(Object o) {
		linkedlist.addFirst(o);
	}
	public Object get() {
		return linkedlist.removeFirst();
		
	}
	
}
