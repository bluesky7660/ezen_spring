package com.mycompany.ch07.fifth;

public abstract class Phone {
	
	public void turnOn() {
		System.out.println("turnOn");
	}
	public void turnOff() {
		System.out.println("turnOff");
	}
	
	public abstract void open();
}
