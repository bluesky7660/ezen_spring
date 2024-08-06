package com.mycompany.ch06.second;

public class Iphone {
	
	//field
	String cpu;
	String memory;
	String color;
	
	public Iphone() {
		
	}
	Iphone(String cpu){
		this.cpu = cpu;
	}
	Iphone(String cpu, String memory){
		this.cpu = cpu;
		this.memory = memory;
	}
	Iphone(String cpu, String memory, String color){
		this.cpu = cpu;
		this.memory = memory;
		this.color = color;
	}
}
