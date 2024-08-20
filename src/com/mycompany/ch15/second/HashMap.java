package com.mycompany.ch15.second;

import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new java.util.HashMap<String, Integer>();
		map.put("장원영", 100);
		map.put("전지현", 100);
		map.put("장동건", 100);
		map.put("고소영", 100);
		
		map.forEach((key,value)->{
			System.out.println(key + " : " + value);
		});
		System.out.println("__________________________");
		for(String strKey : map.keySet()) {	// map : key,value
			Integer strValue = map.get(strKey);
			System.out.println(strKey + " : " + strValue);
		}
	}

}
