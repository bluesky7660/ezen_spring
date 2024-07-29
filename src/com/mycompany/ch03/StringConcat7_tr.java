package com.mycompany.ch03;

public class StringConcat7_tr {

	public static void main(String[] args) {
		//문자열연산자
		
		String stringVal1 = "jdk";
		String stringVal2 = "1.17";
		String stringVal3 = "10";
		int a = 1;
		
		String stringVal4 = stringVal1 + stringVal2;
		
		String stringVal5 = stringVal1 + a;
		String stringVal6 = stringVal3 + a;
		int stringVal7 = Integer.parseInt(stringVal3) + a;
		
		System.out.println("stringVal4: " + stringVal4);
		System.out.println("stringVal5: " + stringVal5);
		System.out.println("stringVal6: " + stringVal6);
		System.out.println("stringVal7: " + stringVal7);
	}

}
