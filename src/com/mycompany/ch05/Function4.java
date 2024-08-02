package com.mycompany.ch05;

public class Function4 {

	public static void main(String[] args) {
		//100 이내의 자연수에서 선택된 수 만큼 합산
		int a = 50;
//		String result = sum(a);
//		System.out.println("1 ~ "+ a + "까지의 합은 : " + result);
		sum(a);
	}
	public static void sum(int a) {
		if(a >100) {
			System.out.println("100 이하의 수를 넣으세요.");
		}else {
			int sum = 0;
			for(int i = 1;i <= a; i++) {
				sum+=i;
			}
			System.out.println("1 ~ "+ a + "까지의 합은 : " + sum);
		}
	}
//	public static String sum(int a) {
//		if(a >100) {
//			String sum = "100 이하의 수를 넣으세요.";

//			return sum;
//		}else {
//			int sum = 0;
//			for(int i = 1;i <= a; i++) {
//				sum+=i;
//			}
//			String result = Integer.toString(sum);
//			return result;
//		}
//		
//	}

}
