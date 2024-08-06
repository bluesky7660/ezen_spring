package com.mycompany.ch06.second;

public class IphoneEx_tr {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		System.out.println("CPU: " + iphone.cpu + "| MEMORY: " + iphone.memory + "| COLOR: " + iphone.color);
		
		Iphone iphone1 = new Iphone("Apple A16 Bionic APL1W10 SoC");
		System.out.println("CPU: " + iphone1.cpu);

		
		Iphone iphone2 = new Iphone("Apple A16 Bionic APL1W10 SoC","256GB");
		System.out.println("CPU: " + iphone2.cpu + "| MEMORY: " + iphone2.memory);

		
		Iphone iphone3 = new Iphone("Apple A16 Bionic APL1W10 SoC","256GB","BLUE");
		System.out.println("CPU: " + iphone3.cpu + "| MEMORY: " + iphone3.memory + "| COLOR: " + iphone3.color);

	}

}
