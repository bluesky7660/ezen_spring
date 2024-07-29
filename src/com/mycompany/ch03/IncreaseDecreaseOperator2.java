package com.mycompany.ch03;

public class IncreaseDecreaseOperator2 {

	public static void main(String[] args) {
		//증감면산자(++.,--)
		
		int i = 7;
		int j = 8;
		
		i++;
		j++;
		
		int k = i++;
		int m = ++j;
		System.out.println("k: " + k);
		System.out.println("i: " + i);
		System.out.println("m: " + m);
		System.out.println("j: " + j);
		System.out.println("------------------------------------");
		
		i--;
		int z = ++i + j++;
		System.out.println("z: " + z);
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("------------------------------------");
		
		
		
		
	}

}
