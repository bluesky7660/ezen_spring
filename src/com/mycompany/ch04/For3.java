package com.mycompany.ch04;

public class For3 {

	public static void main(String[] args) {
		String star1 = "";
		for(int i = 1; i <=5; i++ ) {
			star1 = "";
			for(int j=1; j<=10; j++) {
				star1 +="*";
				
			}
			System.out.println(star1);
		}
		System.out.println("-----------------------------------------------");
		for(int i = 1; i <=5; i++ ) {
			star1 = "";
			for(int j=1; j<=10; j++) {
				if(i!=1&&i!=5) {
					if(j== 1 | j==10) {
						star1 +="*";
					}else {
						star1 +=" ";
					}
				} else {
					star1 +="*";
				}				
			}
			System.out.println(star1);
		}
		System.out.println("-----------------------------------------------");
		String texts = "";
		for(int i = 1; i <=10; i++ ) {
			texts = "";
			for(int j=1; j<=i; j++) {
				
				if(i==10) {
					if(j%2 != 0) {
						texts+=j;
					} else if(j==10) {
						texts+= 0;
					} else {
						texts+= " ";
					}
					
				} else {
					texts+=j;
				}
			}
			System.out.println(texts);
		}
		
		
	}
}
