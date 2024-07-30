package com.mycompany.ch04;

public class If2_tr {

	public static void main(String[] args) {
		
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
		double result = cost * salesCost;
		int salecost = cost - (int)result;
		System.out.println("정가가 " + cost + "원인 " + gradeType + " 등급의 할인가는: " + salecost + "원 입니다.");

	}

}
