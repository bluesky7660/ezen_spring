package com.mycompany.ch05;

public class Function {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		int result = sum(a,b);
		System.out.println("a + b :" + result);
		
		say();
		
		String hello = sayHello();
		System.out.println(hello);
		sum2(a, b);
	}
//	public int<-나갈 값의 데이터타입 sum (int a, int b 들어올값들) {
//	return 1;
	//}
	//public static int sum (int a, int b) {
	//	return  a + b;
	//}
	public static int sum(int a, int b) {
		return a + b;
	}
	public static void say() {
		System.out.println("Hi");
	}
	public static String sayHello() {
		return "Hello";
	}
	public static void sum2(int a, int b) {
		int sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);
	}
}
