package com.mycompany.ch06.second;

public class CarEx_tr {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		System.out.println("car.color: " + car.color);
		
		Car car2 = new Car("블랙"); 
		System.out.println("car2.color: " + car2.color);
		
		Car car3 = new Car(12,"911","화이트","포르쉐"); 
		System.out.println("car3.color: " + car3.color);
		System.out.println("car3.name: " + car3.name);
		System.out.println("car3.company: " + car3.company);

		Car car4 = new Car(4,"쏘나타","레드","현대"); 
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.name: " + car4.name);
		System.out.println("car4.company: " + car4.company);
		car4.name = "아반떼";
		System.out.println("car4.name: " + car4.name);
		
	}

}
