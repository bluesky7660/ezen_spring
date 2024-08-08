package com.mycompany.ch07.second;

public class MobilePhone extends Phone {

	@Override
	public void callVoice() {
		System.out.println("전화걸기 MobilePhone");
	}

	@Override
	public void receiveVoice() {
		System.out.println("전화받기 MobilePhone");
	}

	@Override
	public void linkStation() {
		System.out.println("무선기지국 연결 MobilePhone");
	}

	@Override
	public void charging() {
		System.out.println("배터리 충전 MobilePhone");
	}

}
