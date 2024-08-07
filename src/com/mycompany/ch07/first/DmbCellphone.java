package com.mycompany.ch07.first;

public class DmbCellphone extends Cellphone{
	//필드
	public int channel;
	
	//메소드
	void turnOnDmb() {
		//powerOn();
		System.out.println("채널 " + channel +"번 DMB");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel +"번으로 바뀝니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	void turnOffDmb(int a) {
		
	}
	@Override
	void powerOn() {
		// TODO Auto-generated method stub
		super.powerOn();
	}
	@Override
	void powerOff() {
		// TODO Auto-generated method stub
		super.powerOff();
	}
	@Override
	void bell() {
		// TODO Auto-generated method stub
		super.bell();
	}
	@Override
	void sandVoice(String message) {
		// TODO Auto-generated method stub
		super.sandVoice(message);
	}
	@Override
	void receiveVoice(String message) {
		// TODO Auto-generated method stub
		super.receiveVoice(message);
	}
	@Override
	void hangUp() {
		// TODO Auto-generated method stub
		super.hangUp();
	}
	@Override
	void powerOn(int a) {
		// TODO Auto-generated method stub
		super.powerOn(a);
	}
}
