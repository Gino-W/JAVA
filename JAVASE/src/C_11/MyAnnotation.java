package C_11;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.lang.model.element.Element;

/**
 * @author: Gino
 * @Data: 4 Aug 202010:18:58
 * @File_Name: MyAnnotation.java
 * 
 * 	注解作用目标：
 * 			类上
 * 			方法上
 * 			形参上
 * 			成员变量上
 * 			构造函数上
 * 			包上(需要进行特殊处理)
 * 			局部变量上
 * 
 * RetentionPolicy SOURCE		注解只在源代码中存在，当编译完就不存在了
 * RetentionPolicy CLASS		编译完还存在，当虚拟机加载类时就不存在了
 * RetentionPolicy RUNTIME		当虚拟机加载类，运行类时，一直存在
 */

@SuppressWarnings("unused")
//元注解  为了给注解进行注解的一种注解
@Target(value= {ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	/*
	 * 注解的属性
	 * 格式：	类型   属性值名();
	 * String ,基本数据类型(byte short int long float double char), Class, enum, 
	 * 注解类型, 以上这些一维数组类型
	 */
	
	String value();
	int age() default 18;
	String[] arr();
}
