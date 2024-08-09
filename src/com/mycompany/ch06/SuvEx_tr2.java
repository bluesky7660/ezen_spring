package com.mycompany.ch06;

public class SuvEx_tr2 {

	public static void main(String[] args) {
		Suv_tr2 suv_tr2 = new Suv_tr2();
		System.out.println("suv_tr2 정보 : " + suv_tr2.company + "의 "  + suv_tr2.name + "," + suv_tr2.color + "색상");
		suv_tr2.go();
		suv_tr2.back();
		
		String position = "사장";
		int pay = suv_tr2.pay(position);
		if( pay > 9) {
			pay /= 10;
			System.out.println(position + "의 연봉은 " + pay + "억원 입니다.");
		} else {
			System.out.println(position + "의 연봉은 " + pay + "천만원 입니다.");
		}
		
	}

}
