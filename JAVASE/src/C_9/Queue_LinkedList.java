package C_9;

import java.util.LinkedList;

/**
 * @author: Gino
 * @Data: 2020年7月26日下午7:22:47
 * @File_Name: Queue_LinkedList.java
 * 
 */
public class Queue_LinkedList {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.add("aa");
		queue.add("bb");
		queue.add("cc");
		
		System.out.println(queue.get());
		System.out.println(queue.get());
		System.out.println(queue.get());
	}

}
//描述队列这种数据结构
class Queue{
	private LinkedList linkedlist;
	public Queue() {
		linkedlist = new LinkedList();
	}
	//加到队列的头部
	public void add(Object o) {
		linkedlist.addLast(o);
	}
	
	//把队列的头部数据取出来
	public Object get() {
		return linkedlist.removeFirst();
	}
}
