package com.mycompany.ch06.second;

public class Car_tr {
	
	//field
	int engine;
	String name;
	String color;
	String company;
	
	Car_tr () {	//기본생성자
		
	}
	Car_tr (String color) {//명시적 생성자

		this.color =color;

	}
	Car_tr (int engine, String name, String color, String company) {//명시적 생성자
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
