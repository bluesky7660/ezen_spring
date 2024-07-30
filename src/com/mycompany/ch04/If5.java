package com.mycompany.ch04;

public class If5 {

	public static void main(String[] args) {
		// int 타입의 변수를 3개 선언
		//셰 정수값에서 최대값, 최소값 출력
		
		int a = 2;
		int b = 2;
		int c = 1;
		
//		System.out.println("최대값은 : " + a);
//		System.out.println("최소값은 : " + a);
		
//		if (a >= b && a >= c) {
//			if (a == b && a == c) {
//				System.out.println("최대값은 : " + a);
//				System.out.println("최소값은 : " + a);
//			} else if (c > b) {
//				System.out.println("최대값은 : " + a);
//				System.out.println("최소값은 : " + b);
//			} else if (b > c) {
//				System.out.println("최대값은 : " + a);
//				System.out.println("최소값은 : " + c);
//			}
//		} else if (b >= a && b >= c) {
//			if (b == a && b == c) {
//				System.out.println("최대값은 : " + b);
//				System.out.println("최소값은 : " + b);
//			} else if (c > a) {
//				System.out.println("최대값은 : " + b);
//				System.out.println("최소값은 : " + a);
//			} else if (a > c) {
//				System.out.println("최대값은 : " + b);
//				System.out.println("최소값은 : " + c);
//			}
//		} else if (c >= a && c >= b) {
//			if (c == a && c == b) {
//				System.out.println("최대값은 : " + c);
//				System.out.println("최소값은 : " + c);
//			} else if (a > b) {
//				System.out.println("최대값은 : " + c);
//				System.out.println("최소값은 : " + b);
//			} else if (b > a) {
//				System.out.println("최대값은 : " + c);
//				System.out.println("최소값은 : " + a);
//			}
//		}
		
		if(a != b && b != c && c != a) {
			if(a > b && a > c) {
				System.out.println("최대값은 : " + a);
			} else if (b > a && b > c) {
				System.out.println("최대값은 : " + b);
			} else {
				System.out.println("최대값은 : " + c);
			}
			
			if(a < b && a < c) {
				System.out.println("최소값은 : " + a);
			} else if ( b < a && b < c ) {
				System.out.println("최소값은 : " + b);
			} else {
				System.out.println("최소값은 : " + c);
			}
		} else {
			System.out.println("적어도 2개의 동일한 정수가 존재 합니다. 수정해 주세요");
		}

	}

}
