package com.mycompany.ch06.second;

public class Iphone_tr {
	
	//field
	String cpu;
	String memory;
	String color;
	
	public Iphone_tr() {
		
	}
	Iphone_tr(String cpu){
		this.cpu = cpu;
	}
	Iphone_tr(String cpu, String memory){
		this.cpu = cpu;
		this.memory = memory;
	}
	Iphone_tr(String cpu, String memory, String color){
		this.cpu = cpu;
		this.memory = memory;
		this.color = color;
	}
}
