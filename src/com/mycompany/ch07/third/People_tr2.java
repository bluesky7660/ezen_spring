package com.mycompany.ch07.third;

public class People_tr2 {
	public String name;
	public String ssn;
	
	public People_tr2(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	public People_tr2() {
	}
	void sayName() {
		System.out.println("people_tr2.name: " + name);
	}
}
