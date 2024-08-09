package com.mycompany.ch06.second;

public class Car_tr2 {
	
	int engine;
	String name;
	String color;
	String company;
	
	Car_tr2(){
	}
	Car_tr2(String color){
		this.color = color;
	}
	Car_tr2(int engine,String name,String color,String company){
		this.engine = engine;
		this.name = name;
		this.color = color;
		this.company = company;
	}
	void go() {
		System.out.println("앞으로 갑니다.");
	}
	void back() {
		System.out.println("뒤로 갑니다.");
	}
}
