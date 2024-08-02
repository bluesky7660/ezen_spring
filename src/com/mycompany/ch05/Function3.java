package com.mycompany.ch05;

public class Function3 {

	public static void main(String[] args) {
		int a = 1;
		int b = 5;
		int c = 4;
		int big = big(a, b, c);
		System.out.println("최대값은 " + big);
		
	}
	public static int big(int a, int b ,int c) {
		int big = 0;
		if(a>b&a>c) {
			big = a;
		}else if(b > c){
			big = b;
		}else {
			big = c;
		}
		return big;
	}

}
