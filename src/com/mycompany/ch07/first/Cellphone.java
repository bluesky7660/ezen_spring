package com.mycompany.ch07.first;

public class Cellphone {
	//필드
	public String model;
	public String color;
	
	//생성자
	
	//메소드
	void powerOn() {System.out.println("전원을 켭니다.");}
	void powerOff() {System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sandVoice(String message) {System.out.println("자기가다.");}
	void receiveVoice(String message) {System.out.println("받기.");}
	void hangUp() {System.out.println("전화를 끊습니다.");}
	void powerOn(int a) {System.out.println("전원을 켭니다. 2");}
}
