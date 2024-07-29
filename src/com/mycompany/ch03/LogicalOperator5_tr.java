package com.mycompany.ch03;

public class LogicalOperator5_tr {

	public static void main(String[] args) {
		//논리연산자
		int a = 65;
		if(a >= 65 && a <= 70) {
			System.out.println("&&:true");
		}
		if(a >= 65 & a <= 70) {
			System.out.println("&:true");
		}
		if(a > 65 || a <= 70) {
			System.out.println("||:true");
		}
		if(a > 65 | a <= 70) {
			System.out.println("|:true");
		}
		if(a > 65 ^ a <= 70) {
			System.out.println("^:true");
		}

	}

}
