package com.mycompany.ch05;

public class Function3_tr {

	public static void main(String[] args) {
		int a = 1;
		int b = 5;
		int c = 4;
		int big = comparison(a, b,c);
		System.out.println("a,b,c 중에서 최대값은 " + big);
		
	}
	public static int comparison(int a, int b, int c) {
		int big = 0;
		if(a > b & a > c) {
			big = a;
		} else if(b > a & b > c) {
			big = b;
		} else {
			big = c;
		}
		return big;
	}

}
