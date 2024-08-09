package com.mycompany.ch06.fifth;

public class CalculatorEx_tr2 {

	public static void main(String[] args) {
		
		System.out.println("pi: " + Calculator_tr2.pi);
		add(1,3);
		Calculator_tr2.addStatic(1,4);
	}
	public static int add(int a, int b) {
		return a + b;
	}
	public int minus(int a, int b) {
		int result = add(1,2);
		return a - b;
	}

}
