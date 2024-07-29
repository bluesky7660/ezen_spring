package com.mycompany.ch03;

public class IncreaseDecreaseOperator2_tr {

	public static void main(String[] args) {
		//증감연산자
		
		int i = 7;
		int j = 8;
		i++;
		j++;
		
		int k = ++i;
		int m = j++;
		System.out.println("k: " + k);
		System.out.println("i: " + i);
		System.out.println("m: " + m);
		System.out.println("j: " + j);
		System.out.println("-----------------------------------------");
		
		i--;
		int a = ++i + j++;
		System.out.println("a: " + a);
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		
		
	}

}
