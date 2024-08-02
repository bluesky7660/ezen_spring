package com.mycompany.ch05;

public class Function_tr {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int sum = sum(a,b);
		System.out.println("sum = " + sum);
		say();
	}
	public static int sum(int a, int b ) {
		int result = a + b;
		return result;
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
