package com.mycompany.ch06;

public class Suv_tr2 {
	int engeine = 10;
	String name = "카이엔(cayenne)";
	String color = "블랙";
	String company = "포르쉐";
	
	void go () {
		System.out.println("앞으로 갑니다.");
	}
	void back () {
		System.out.println("후진합니다.");
	}
	public int pay(String a) {
		int  result = 0;
		switch (a) {
			case "사장": {
				result = 20000;
				break;
			}
			case "부장": {
				result = 10000;
				break;
			}
			case "과장": {
				result = 8000;
				break;
			}
			case "대리": {
				result = 6000;
				break;
			}
			case "사원": {
				result = 4000;
				break;
			}
			case "나": {
				result = 3000;
				break;
			}
			
		}
		result /=1000;
		return result;
		
	}
}
