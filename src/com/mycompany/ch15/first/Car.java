package com.mycompany.ch15.first;

public class Car {
	private String name;
	private int cc;
	
	Car(String name ,int cc) {
		this.name = name;
		this.cc = cc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
}
