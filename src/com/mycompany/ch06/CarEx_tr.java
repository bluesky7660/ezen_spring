package com.mycompany.ch06;

public class CarEx_tr {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("자동차 정보 : " + car.company + "의 "  + car.name + "," + car.color + "색");
		System.out.println();
		car.go();
		car.go();
		car.go();
		car.go();
		car.back();  
		car.back();
		car.back();
		
		Car_tr car2 = new Car_tr();
		System.out.println("자동차 정보 : " + car2.company + "의 "  + car2.name + "," + car2.color + "색상");
		car2.go();
		car2.back();
	}

}
