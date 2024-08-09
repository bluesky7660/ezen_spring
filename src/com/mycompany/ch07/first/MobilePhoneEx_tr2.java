package com.mycompany.ch07.first;

public class MobilePhoneEx_tr2 {

	public static void main(String[] args) {
		
		Cellphone_tr2 cellphone_tr2 = new Cellphone_tr2();
		cellphone_tr2.powerOn();
		
		DmbCellphone_tr2 dmbCellphone_tr2 = new DmbCellphone_tr2();
		dmbCellphone_tr2.turnOffDmb();
		dmbCellphone_tr2.powerOn();
		
		Mobile_tr2 mobile_tr2 = new Mobile_tr2();
		
		mobile_tr2.powerOff();
		mobile_tr2.changeChennelDmb();
		mobile_tr2.aaa();

	}

}
