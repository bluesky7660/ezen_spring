package com.mycompany.ch07.second;

public class MusicPhone_tr2 extends Phone_tr2{
	public void musicDown() {
		System.out.println("음악다운받기");
	}
	public void musicPlay() {
		System.out.println("음악재생하기");
	}
	@Override
	public void callVoice() {
		System.out.println("전화걸기 music");
	}

	@Override
	public void receiveVoice() {
		System.out.println("전화받기 music");
	}

	@Override
	public void linkStation() {
		System.out.println("무선기지국 연결 music");
	}

	@Override
	public void charging() {
		System.out.println("배터리 충전 music");
	}
}
