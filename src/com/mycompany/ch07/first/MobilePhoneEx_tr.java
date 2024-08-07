package com.mycompany.ch07.first;

public class MobilePhoneEx_tr {

	public static void main(String[] args) {
		
		Cellphone cellphone = new Cellphone();
		cellphone.powerOn();
		
		DmbCellphone dmbCellphone = new DmbCellphone();
		
		dmbCellphone.turnOffDmb();
		
		dmbCellphone.powerOn();
		
		Mobile mobile = new Mobile();
		
		mobile.powerOff();
		mobile.changeChannelDmb(1);
		mobile.aaa();

	}

}
