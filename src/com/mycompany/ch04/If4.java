package com.mycompany.ch04;

public class If4 {

	public static void main(String[] args) {
		//int 타입의 변수를 2개 선언
		//두정수가 주어졌을때 사분면 어디에 해당되는지 출력하는
		
		//EX . System.out.println("(a,b)는 1사분면에 위치합니다.");
		
		int a = 0;
		int b = 1;
		
		if(a > 0 && b > 0) {
			System.out.println("(a,b)는 1사분면에 위치합니다.");
		} else if (a < 0 && b > 0) {
			System.out.println("(a,b)는 2사분면에 위치합니다.");
		} else if (a > 0 && b < 0) {
			System.out.println("(a,b)는 3사분면에 위치합니다.");
		} else if (a < 0 && b < 0) {
			System.out.println("(a,b)는 4사분면에 위치합니다.");
		} else if (a == 0 && b == 0) {
			System.out.println("(a,b)는 중앙에 위치합니다.");
		} else if (a == 0 || b == 0) {
			System.out.println("변수값에 0을 넣지 마세요.");
		}
		
//		int a = -2;
//		int b = 0;
//		
//		if(a>0 && b>0) {
//			System.out.println("(a,b)는 1사분면에 위치합니다");
//		} else if(a<0 && b>0) {
//			System.out.println("(a,b)는 2사분면에 위치합니다");
//		} else if(a<0 && b<0) {
//			System.out.println("(a,b)는 3사분면에 위치합니다");
//		} else if(a>0 && b<0) {
//			System.out.println("(a,b)는 4사분면에 위치합니다");
//		} else if(a==0 && b!= 0) {
//			System.out.println("(a,b)는 x축 위에 있습니다");
//		} else if(a!=0 && b== 0) {
//			System.out.println("(a,b)는 y축 위에 있습니다");
//		} else {
//			// a==0 & b==0
//			System.out.println("(a,b)는 원점입니다.");
//		}
		

	}

}
