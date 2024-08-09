package com.mycompany.ch07.second;

public class MobilePhone_tr2 extends Phone_tr2{

	@Override
	public void callVoice() {
		System.out.println("전화걸기 모바일");
	}

	@Override
	public void receiveVoice() {
		System.out.println("전화받기 모바일");
	}

	@Override
	public void linkStation() {
		System.out.println("무선기지국 연결 모바일");
	}

	@Override
	public void charging() {
		System.out.println("배터리 충전 모바일");
	}


}
