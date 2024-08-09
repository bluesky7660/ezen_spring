package com.mycompany.ch06.second;

public class IphoneEx_tr2 {

	public static void main(String[] args) {
		
		Iphone_tr2 iphone_tr2 = new Iphone_tr2();
		System.out.println("CPU: " + iphone_tr2.cpu + "| MEMORY: " + iphone_tr2.memory + "|COLOR: " + iphone_tr2.color);
		
		Iphone_tr2 iphone_tr22 = new Iphone_tr2("Apple A16 Bionic APL1W10 SoC");
		System.out.println("CPU: " + iphone_tr22.cpu);
		
		Iphone_tr2 iphone_tr23 = new Iphone_tr2("Apple A16 Bionic APL1W10 SoC","256GB");
		System.out.println("CPU: " + iphone_tr23.cpu + "| MEMORY: " + iphone_tr23.memory);
		
		Iphone_tr2 iphone_tr24 = new Iphone_tr2("Apple A16 Bionic APL1W10 SoC","256GB","BLUE");
		System.out.println("CPU: " + iphone_tr24.cpu + "| MEMORY: " + iphone_tr24.memory + "|COLOR: " + iphone_tr24.color);
		

	}

}
