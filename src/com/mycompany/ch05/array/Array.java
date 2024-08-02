package com.mycompany.ch05.array;

import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		
		//list를 이용한ㄴ 배열 선언
		int[] scoreChemistry = {100,99,98,97,96,95,94};
		int scoreChemistry2[] = {100,99,98,97,96,95,94};
		
//		System.out.println(scoreChemistry);
		for (int i = 0; i <  scoreChemistry.length; i++) {
			System.out.println("scoreChemistry[" + i + "] : " + scoreChemistry[i]);
		}
		
		System.out.println("scoreChemistry.length : " + scoreChemistry.length);
		System.out.println("------------------------------------------------");
		
		int[] scoreChemistry3 = new int[7];
		int scoreChemistry4[] = new int[7];
		
		scoreChemistry3[0] = 100;
		scoreChemistry3[1] = 99;
		scoreChemistry3[2] = 98;
		scoreChemistry3[3] = 97;
		scoreChemistry3[4] = 96;
		scoreChemistry3[5] = 95;
		scoreChemistry3[6] = 94;
		
		for (int i = 0; i <  scoreChemistry3.length; i++) {
			System.out.println("scoreChemistry3[" + i + "] : " + scoreChemistry3[i]);
		}
		System.out.println("scoreChemistry3.length : " + scoreChemistry3.length);
		System.out.println("------------------------------------------------");
		
		//향상된 for 문
		int i = 0;
		for(int a: scoreChemistry3) { //int a = scoreChemistry3[0]..... int a = scoreChemistry3[6]
			System.out.println("scoreChemistry3[" + i + "] : " + a);
			i++;
		}
	}

}
