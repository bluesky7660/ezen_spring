package com.mycompany.ch06.third;

public class ArithmeticEx {

	public static void main(String[] args) {
		
		Arithmetic arithmetic = new Arithmetic();
		
		int result = arithmetic.sum(1,4);
		System.out.println(result);
		
		int result2 = arithmetic.min(5,4);
		System.out.println(result2);
		
		int result3 = arithmetic.mult(5,4);
		System.out.println(result3);
		
		int result4 = arithmetic.div(5,2);
		System.out.println(result4);

	}

}
