package com.mycompany.ch06;

public class Suv_tr {
	int engine = 10;
	String name = "마칸(Macan)";
	String color = "프로즌 블루";
	String company = "포르쉐";
	
	void go() {
		System.out.println("앞으로 갑니다~~");
	}
	void back() {
		System.out.println("후진합니다~~");
	}
	public int pay3(String a) {
		int result = 0;
		switch (a) {
			case "사장": {
				result = 50000;
				break;
			}
			case "부장": {
				result = 20000;
				break;
			}
			case "과장": {
				result = 10000;
				break;
			}
			case "대리": {
				result = 7000;
				break;
			}
			case "사원": {
				result = 5000;
				break;
			}
			case "나": {
				result = 4000;
				break;
			}
		}
		result /=1000;
		
		return result;

	}
	public String pay2(String a) {
		int result = 0;
		String result2 = "";
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
		
		if(result> 9) {
			result/=10;
			result2 = result +"억원";
		}else {
			result2 = result +"천만원";
		}
		return result2;
	}
}
