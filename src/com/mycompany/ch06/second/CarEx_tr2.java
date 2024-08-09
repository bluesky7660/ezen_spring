package com.mycompany.ch06.second;

public class CarEx_tr2 {

	public static void main(String[] args) {
		
		Car_tr2 car_tr2 = new Car_tr2();
		System.out.println("car_tr2.color" + car_tr2.color);
		
		Car_tr2 car_tr22 = new Car_tr2("블랙");
		System.out.println("car_tr22.color" + car_tr22.color);
		
		Car_tr2 car_tr23 = new Car_tr2(12,"911","화이트","포르쉐");
		System.out.println("car_tr23.color" + car_tr23.color);
		System.out.println("car_tr23.name" + car_tr23.name);
		System.out.println("car_tr23.company" + car_tr23.company);
		
		Car_tr2 car_tr24 = new Car_tr2(4, "쏘나타", "레드", "현대");
		System.out.println("car_tr24.color" + car_tr24.color);
		System.out.println("car_tr24.name" + car_tr24.name);
		System.out.println("car_tr24.company" + car_tr24.company);
		car_tr24.name = "아반떼" ;
		System.out.println("car_tr24.name" + car_tr24.name);
		
	}

}
