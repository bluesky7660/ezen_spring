package com.mycompany.ch04;

public class If4_tr {

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
		} else{
			System.out.println("적절한 변수를 넣으세요");
		}

		

	}

}
