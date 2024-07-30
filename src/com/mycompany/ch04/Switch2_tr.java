package com.mycompany.ch04;

public class Switch2_tr {

	public static void main(String[] args) {
		String position = "사장";
		
		switch (position) {
		case "사장": {
			System.out.println(position + "의 연봉은 20,000 입니다.");
			break;
		}
		case "부장": {
			System.out.println(position + "의 연봉은 11,000 입니다.");
			break;
		}
		case "과장": {
			System.out.println(position + "의 연봉은 8,000 입니다.");
			break;
		}
		case "대리": {
			System.out.println(position + "의 연봉은 6,000 입니다.");
			break;
		}
		case "주임": {
			System.out.println(position + "의 연봉은 4,000 입니다.");
			break;
		}
		case "사원": {
			System.out.println(position + "의 연봉은 3,500 입니다.");
			break;
		}
		case "나": {
			System.out.println(position + "의 연봉은 3,300 입니다.");
			break;
		}
		default:
			System.out.println("정해진값(사장 부장,과장,대리,주임 ,사원, 나)만 변수에 대입하세요");
		}
	}

}
