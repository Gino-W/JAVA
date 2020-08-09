package C_13_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/**
 * @author: Gino
 * @Data: 9 Aug 202015:51:09
 * @File_Name: DateDemo.java
 * 
 */


/*
 * 与时间相关的类
 * 		1.System
 * 		2.Date
 * 		3.SimpleDateFormat
 * 		4.Calendar
 */
public class DateDemo {

	@Test
	public void testSystem() {
		//可以测试程序效率
		long start = System.currentTimeMillis();
		for(int i=0; i<1000000000; i++) {
			
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
	
	@Test
	public void testDate() {
		Date date = new Date();//当前的事件对象
		//日期对象--->毫秒值
		long time = date.getTime();
		//毫秒值--->日期对象  (构造函数)
		Date d = new Date(time);
		
		System.out.println();
		
//		System.out.println(time);
//		System.out.println(date);
	}
	
	@Test
	public void testSimpleDateFormat() throws ParseException {
		Date d = new Date();
		
		//需要格式化日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
		//把日期对象转换成自定义格式的文本
		String format = sdf.format(d);
		System.out.println(format);
		
		//将指定格式的日期文本转换为日期对象
		String str = "2010-1-1---12:12:12";
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd---HH:mm:ss");
		Date parse = sm.parse(str);
		System.out.println(parse);		
	}
	
	@Test
	public void testCalendar() {
		Calendar c = Calendar.getInstance();
//		Date time = c.getTime();
//		long timeInMillis = c.getTimeInMillis();
		
//		int i = c.get(Calendar.DAY_OF_MONTH);
//		System.out.println(i);
		
//		c.set(Calendar.DAY_OF_MONTH, 2);//设置日期
		c.add(Calendar.DAY_OF_MONTH, -2);//减两天
		Date time = c.getTime();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = simpleDateFormat.format(time);
		System.out.println(format);
	}
}
