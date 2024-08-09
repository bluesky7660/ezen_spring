package com.mycompany.ch06;

public class CarEx_tr2 {

	public static void main(String[] args) {
		Car_tr2 car_tr2 = new Car_tr2();
		System.out.println("자동차 정보 : " + car_tr2.company + "의 "  + car_tr2.name + "," + car_tr2.color + "색");
		System.out.println();
		car_tr2.go();
		car_tr2.back();
		
		
	}

}
