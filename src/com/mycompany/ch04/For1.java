package com.mycompany.ch04;

import java.util.Iterator;

public class For1 {

	public static void main(String[] args) {
		
//		for(int i = 1; i <= 3; i++) {
//			System.out.println("i: " + i);
//			for(int j = 1; j <= 3; j++) {
//				System.out.println("j+i: " + j);
//			}
//		}
//		System.out.println("-----------------------------");
//		for(int i = 1; i <= 3; i++) {
//			System.out.println("i: " + i);
//		}
//		System.out.println("-----------------------------");
		for(int i = 2 ; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "단:" + i + " * " + j +" : " + i*j);
			}
			if(i == 9) {
				
			} else {
				System.out.println("-----------------------------");
			}
		}
	}

}
