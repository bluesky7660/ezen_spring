package com.mycompany.ch04;

public class For2_tr {

	public static void main(String[] args) {
		
		int sum = 0;
		 for(int i = 1;  i <= 10; i++) {
			 sum+=i;
		 }
		 System.out.println("1~10까지 의 합은 " + sum);
		 System.out.println("-------------------------------");
		 sum = 0;
		 for(int i = 11; i <= 50; i++) {
			 if(i%2 == 0) {
				 sum+=i;
			 }
			 System.out.println("i와 sum 값은 " + i +", " + sum);
		 }
		 System.out.println("11~50까지 짝수들의 합은 " + sum);
	}

}
