package com.mycompany.ch06;

public class SuvEx_tr {

	public static void main(String[] args) {
		Suv_tr suv_tr = new Suv_tr();
		System.out.println("suv 정보 : " + suv_tr.company + "의 "  + suv_tr.name + "," + suv_tr.color + "색상");
		suv_tr.go();
		suv_tr.back();
		
		

		String position = "사장";
		
		String pay =  suv_tr.pay2(position);
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
