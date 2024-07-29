package com.mycompany.ch03;

public class ConditionalOperator8 {

	public static void main(String[] args) {
		
		//삼항 연산자 (조건식) ? A : B
		int math = 85;
		char grade = (math > 90 ) ? 'A' : 'B';
		System.out.println("수학점수:" + grade);
		
		int a = 0;
		
		int b = (a == 0) ? 10 : 20;
		System.out.println("대입한 값은 : " + b);
		
	}

}
