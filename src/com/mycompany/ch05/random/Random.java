package com.mycompany.ch05.random;

import java.util.Arrays;

public class Random {

	public static void main(String[] args) {
		int num[] = new int[6];
//		int num = 0;
		int min = 1;
		int max = 45;
		int x = 0;
		
//		num =  (int) (Math.random()*(max - min) + min);
//		System.out.println(num);
		for(int i = 0; i < num.length; i++) {
			num[i] =  (int) ((Math.random()*(max - min))+ min);
			for(int j = 0;j < i; j++){
				//중복
				if(num[i] == num[j]) {	//i 는 현재 , j는 i 전 값들
					System.out.println(num[i] + " : " + num[j]);
					System.out.println("중복입니다");
					i--;
					break;
				}
				if(i >= 2 && num[i] == num[i-1] + 1 && num[i-1] == num[i-2] + 1) {
					System.out.println(num[i-2] + " : " + num[i-1] + " : " + num[i]);
					System.out.println(i);
					System.out.println("3연속입니다");
					i--;
					break;
				}
				
			}
			
		}
		Arrays.sort(num); 

		System.out.print("이번주 로또 번호는 ");
        for (int i = 0; i < num.length; i++) {
        	System.out.print("(");
            System.out.print(num[i]);
            System.out.print(")");
            if (i < num.length - 1) {
                System.out.print(", "); // 번호 사이에 공백 추가
            }
        }
        System.out.print(" 입니다.");
		

	}

}
