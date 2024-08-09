package com.mycompany.ch07.first;

public class DmbCellphone_tr2 extends Cellphone_tr2{
	public int chennel;
	
	void turnOnDmb() {
		System.out.println("채널 " + chennel + "번 DMB");
	}
	void changeChennelDmb() {
		System.out.println("채널 " + chennel + "번으로 바뀝니다.");
	}
	void turnOffDmb() {
		System.out.println("채널 " + chennel + "번 DMB");
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
	void sandVoice(String messsage) {
		// TODO Auto-generated method stub
		super.sandVoice(messsage);
	}
	@Override
	void receiveVoice(String messsage) {
		// TODO Auto-generated method stub
		super.receiveVoice(messsage);
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
