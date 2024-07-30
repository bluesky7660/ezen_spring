package com.mycompany.ch03;

public class ConditionalOperator8_tr {

	public static void main(String[] args) {
		//삼항연산자
		int math = 85;
		char grade = (math > 90) ? 'A' : 'B';
		System.out.println("수학점수:" + grade);
		
		int a = 0;
		int b = (a == 0) ? 10: 20;
		System.out.println("b: " + b);
  
	}

}
