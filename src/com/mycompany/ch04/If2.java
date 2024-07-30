package com.mycompany.ch04;

public class If2 {

	public static void main(String[] args) {
		//일반 1 5%할인
		//브론즈2 10%
		//실버 3 15
		//골드 4 20
		//플래티넘 5 2.7%
		
		//정가가 12000원인 실버 등급의 할인가는:10200원 입니다.
		
		int grade = 3;
		int cost = 12000;
		double salesCost = 0.0;
		String gradeType = "";
		
		if(grade == 1) {
			salesCost = 0.05;
			gradeType = "일반";
		} else if (grade == 2) {
			salesCost = 0.1;
			gradeType = "브론즈";
		} else if (grade == 3) {
			salesCost = 0.15;
			gradeType = "실버";
		} else if (grade == 4) {
			salesCost = 0.2;
			gradeType = "골드";
		} else if (grade == 5) {
			salesCost = 0.027;
			gradeType = "플래티넘";
		}
			

//		double result = cost * salesCost;
//		int salecost = cost - (int)result;
//		System.out.println("정가가 " + cost + "원인 " + gradeType + " 등급의 할인가는: " + salecost + "원 입니다.");
//		
//		if(grade == 1) {
//			salesCost = cost * (1-0.05);
//			System.out.println("정가가 " + cost + "원인 일반 등급의 할인가는: " + (int) salesCost + "원 입니다.");
//		} else if(grade == 2) {
//			salesCost = cost * (1-0.1);
//			System.out.println("정가가 " + cost + "원인 브론즈 등급의 할인가는: " + (int) salesCost + "원 입니다.");
//		} else if(grade == 3) {
//			salesCost = cost * (1-0.15);
//			System.out.println("정가가 " + cost + "원인 실버 등급의 할인가는: " + (int) salesCost + "원 입니다.");
//		} else if(grade == 4) {
//			salesCost = cost * (1-0.2);
//			System.out.println("정가가 " + cost + "원인 골드 등급의 할인가는: " + (int) salesCost + "원 입니다.");
//		} else if (grade == 5) {
//			salesCost = cost * (1-0.027);
//			System.out.println("정가가 " + cost + "원인 플래티넘 등급의 할인가는: " + (int) salesCost + "원 입니다.");
//		} else {
//			System.out.println("1~5 까지의 grade 만 가능합니다.");
//		}

	}

}
