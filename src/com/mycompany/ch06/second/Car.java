package com.mycompany.ch06.second;

public class Car {
	
	//field
	int engine;
	String name;
	String color;
	String company;
	
	Car () {	//기본생성자
		
	}
	Car (String color) {//명시적 생성자

		this.color =color;

	}
	Car (int engine, String name, String color, String company) {//명시적 생성자
		this.engine = engine;
		this.name = name;
		this.color =color;
		this.company = company;
	}
	void go() {
		System.out.println("앞으로 갑니다.");
	}
	void back() {
		System.out.println("뒤로 갑니다.");
	}
}
