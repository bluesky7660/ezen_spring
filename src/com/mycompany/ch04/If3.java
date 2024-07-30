package com.mycompany.ch04;

public class If3 {

	public static void main(String[] args) {
		//int 타입의 변수를 1개 선언하고
		//짝수인지 홀수인지 판단하여 결과를 출력하는 
		int a = 2;
		
		if ((a % 2) == 0) {
			
			if (a == 0 || a < 0) {
				System.out.println("음수나 0을 변수로 선언하지마세요.");
			} else {
				System.out.println("a변수는 짝수입니다.");
			}
		} else {
			System.out.println("a변수는 홀수입니다.");
		}

	}

}
