package com.mycompany.ch04;

public class While1 {

	public static void main(String[] args) {
		
		//1부터 10까지 더하는 프로그램
		
		int sum = 0;
		int i = 1;
		while (i<=10) {
			sum+=i;
			System.out.println("i 와 sum 값은 :" + i +", "+ sum);
			i++;
		}
		System.out.println("1부터 10까지 더하는 값은 " + sum);
	}

}
