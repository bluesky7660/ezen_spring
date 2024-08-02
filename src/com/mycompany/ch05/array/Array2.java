package com.mycompany.ch05.array;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		
		String[] name = {"장동건","차태식", "마동석", "마장동", "마혜영"};
		int[][] score = {{99,88,55},{55,77,66},{55,55,44},{78,85,45},{47,59,87}};
		score[0][0] = 100;
		for(int i = 0;i< score.length;i++) {
			for(int j = 0;j < score[i].length; j++) {
//				System.out.println(name[i] + " : " + score[i][j]);
			}
			System.out.println(name[i] + " : " + Arrays.toString(score[i]) );
		}

	}

}
