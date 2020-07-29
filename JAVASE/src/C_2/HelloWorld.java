package C_2;

import java.util.Scanner;


public class HelloWorld {
	public static void main(String[] args) {
		
		//关系运算符
//		boolean l = "Hello" instanceof String; 
//		System.out.println(l);
		
		//三元运算符
//		int x = 8;
//		int y = 9;
//		int result = (x>y)?x:y;
//		System.out.println(result);
		
		//if  判断奇偶
//		int x  = 9;
//		if(x % 2 == 0) {
//			System.out.println(x + "是偶数");
//		}else {
//			System.out.println(x + "是奇数");
//		}
		
		
		//switch语句
//		int week = 2;
//		switch(week) {
//			case 1:
//				System.out.println("星期一");
//				break;
//			case 2:
//				System.out.println("星期二");
//				break;
//			case 3:
//				System.out.println("星期三");
//				break;
//			default:
//				System.out.println("啥也不是");
//		}
		
		//水仙花数
//		for(int i = 100; i<1000; i++) {
//			int ge = i % 10;
//			int shi = i / 10 %10;
//			int bai = i / 10 / 10 % 10;
//			if(((ge*ge*ge) + (shi*shi*shi) + (bai*bai*bai)) == i) {
//				System.out.println(i);
//			}
//		}
		
//		//for循环    99乘法表
//		for(int i = 1; i<10; i++) {
//			for(int j = 1; j<=i; j++) {
//				System.out.print(j + "*" + i + "=" + i*j + "\t");
//			}
//			System.out.println();
//		}
		
		//while  先判断后执行
//		int i = 0;
//		while(i<0) {
//			System.out.println("Hello");
//			i++;
//		}
		
//		//do-while  先执行后判断
//		do{
//			System.out.println("Hello");
//			i++;
//		}while(i<0);
		
		//break
//		for(int i = 0; i<10;i++) {
//			if(i == 8) {
//				break;//结束本次循环
//			}
//			System.out.println(i);
//		}
		//continue
//		for(int i = 0; i<10;i++) {
//			if(i == 8) {
//				continue;//跳出本次循环，继续下一次循环
//			}
//			System.out.println(i);
//		}
		
		//函数的调用
//		add(3,5);
//		add(5,5.8);
		
		//数组
//		int[] arr = new int[8];//实体对象  实例对象
//		System.out.println(arr[1]);
		
		//数组二
//		int[] arr = {1,4,6,8,3,5};
//		System.out.println(arr.length);
		
		//遍历数组
//		int[] arr = {2,4,8,9};
//		Bianli(arr);
		
		//二维数组
		int[][] arr = new int[2][3];
		System.out.println(arr );
		
	}
	
	
	//函数
//	static void add(int a, int b) {
//		int result = a + b;
//		System.out.println(result);
//	}
//	//函数重载
//	static void add(int a, double b) {
//		double x = a + b;
//		System.out.println(x);
//	}
	//遍历数组
//	static void Bianli(int arr[]) {
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//	}

}