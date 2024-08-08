package com.mycompany.ch07.third;

public class People_tr {
	public String name;
	public String ssn;
	
	public People_tr(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	public People_tr() {
	}
	void sayName() {
		System.out.println("people_tr.name: " + name);
	}
}
