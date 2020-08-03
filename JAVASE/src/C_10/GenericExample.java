package C_10;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 2 Aug 202010:07:25
 * @File_Name: GenericExample.java
 * 
 */
public class GenericExample {
	
	@Test
	public void testLinkedList() {
		List<Person> list = new LinkedList<Person>();
		list.add(new Person("张三",20));
		list.add(new Person("李四",19));
		list.add(new Person("王五",12));
		Iterator<Person> it = list.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getName());	
		}
	}
	
	//TreeSet3 类型转换异常   需要制定比较规则
	@Test
	public void testTreeSet() {
		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(new Person("张三",20));
		ts.add(new Person("李四",19));
		ts.add(new Person("王五",18));
		Iterator<Person> it = ts.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getName());
		}
	}
	//集合定义比较器优先级高
	@Test
	public void testTreeSet2() {
		TreeSet<Person> ts = new TreeSet<Person>(new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				if(p1.getAge().compareTo(p2.getAge()) == 0){
					return p1.getName().compareTo(p2.getName());
				}
				return p1.getAge().compareTo(p2.getAge());
			}
		});
		ts.add(new Person("zs",20));
		ts.add(new Person("ls",20));
		ts.add(new Person("ww",20));
		Iterator<Person> it = ts.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getName());
		}
	}
	
	@Test
	public void testHashMap() {
		Map<String, Person> map = new HashMap<String, Person>();
		map.put("aa", new Person("zs",20));
		map.put("bb", new Person("ls",19));
		map.put("cc", new Person("ww",18));
		
		//1.遍历key集合
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()){
			String key = it.next();
			Person person = map.get(key);
			System.out.println(person.getName());
		}
		
		System.out.println("------------------------------------------------");
		
		//2.遍历Empty实体
		Set<Entry<String, Person>> entrySet = map.entrySet();
		Iterator<Entry<String, Person>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<String, Person> entry = iterator.next();
			String key = entry.getKey();
			Person value = entry.getValue();
			System.out.println(value.getName());
		}
	}
}
