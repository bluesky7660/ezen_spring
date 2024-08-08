package com.mycompany.ch07.third;

public class People {
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	public People() {
	}
	void sayName() {
		System.out.println("people.name: " + name);
	}
}
