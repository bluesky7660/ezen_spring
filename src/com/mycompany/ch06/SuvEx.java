package com.mycompany.ch06;

public class SuvEx {

	public static void main(String[] args) {
		Suv suv = new Suv();
		System.out.println("suv 정보 : " + suv.company + "의 "  + suv.name + "," + suv.color + "색상");
		suv.go();
		suv.back();
		
		

		String position = "사장";
//		int pay = suv.pay(position);
//		if(pay> 9) {
//			pay/=10;
//			System.out.println(position + "의 연봉은 " + pay + "억원 입니다.");
//		}else {
//			System.out.println(position + "의 연봉은 " + pay + "천만원 입니다.");
//		}
		
		String pay = suv.pay2(position);
		System.out.println(position + "의 연봉은 " + pay + " 입니다.");
		
		Suv_tr suv2 = new Suv_tr();
		String pos = "대리";
		int pay2 = suv2.pay3(pos);
		if(pay2 > 9) {
			pay2/=10;
			System.out.println(pos + "의 연봉은 " + pay2 + "억원 입니다.");
		}else {
			System.out.println(pos + "의 연봉은 " + pay2 + "천만원 입니다.");
		}
		
		
	}

}
