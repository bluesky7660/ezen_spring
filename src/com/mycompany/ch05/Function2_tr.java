package com.mycompany.ch05;

public class Function2_tr {

	public static void main(String[] args) {
		//작수 홀수 구분 하는 함수
		int a= 1;
		String result = dist(a);
		System.out.println(result);
	}
	public static String dist(int a) {
		String result = "";
		
		if (a % 2 == 0) {
			result = "짝수";
		}else {
			result = "홀수";
		}
			
		
		return result; 
	}

}
