package com.mycompany.ch05;

public class Function2 {

	public static void main(String[] args) {
		//작수 홀수 구분 하는 함수
		int a = 2;
		String result = dist(a);
		System.out.println("a["+ a +"]는 " + result + "입니다");
		dist2(a);
	}
	/*리턴형*/
	public static String dist(int a) {
		String result = "";
		if(a%2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		return result;
	}
	/*보이드형*/
	public static void dist2(int a) {
		if(a%2 == 0) {
			System.out.println("a["+ a +"]는 짝수입니다");
		} else {
			System.out.println("a["+ a +"]는 홀수입니다");
		}
	}

}
