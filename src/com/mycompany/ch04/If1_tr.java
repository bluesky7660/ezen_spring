package com.mycompany.ch04;

public class If1_tr {

	public static void main(String[] args) {
		int score = 92;
		
		if (score >= 90) {
			System.out.println(score + "점은 A 입니다.");
		}else if (score >= 80) {
			System.out.println(score + "점은 B 입니다.");
		}else if (score >= 70) {
			System.out.println(score + "점은 C 입니다.");
		}else if (score >= 60) {
			System.out.println(score + "점은 D 입니다.");
		}else {
			System.out.println(score + "점은 F 입니다.");
		}
		
		
		if (score >= 90  ) {
			System.out.println(score + "점은 A 입니다.");
		}else if (score >= 80 && score <= 89) {
			System.out.println(score + "점은 B 입니다.");
		}else if (score >= 70 && score <= 79) {
			System.out.println(score + "점은 C 입니다.");
		}else if (score >= 60 && score <= 69) {
			System.out.println(score + "점은 D 입니다.");
		}else {
			System.out.println(score + "점은 F 입니다.");
		}
		
		if (score >= 90) {
			if (score >= 97) {
				System.out.println(score + "점은 A+ 입니다.");
			} else if (score >= 94 && score <= 96) {
				System.out.println(score + "점은 A0 입니다.");
			} else if (score >= 90 && score <= 93) {
				System.out.println(score + "점은 A- 입니다.");
			}
		} else if (score >= 80 && score <= 89) {
			if (score >= 87) {
				System.out.println(score + "점은 B+ 입니다.");
			} else if (score >= 84 && score <= 86) {
				System.out.println(score + "점은 B0 입니다.");
			} else if (score >= 80 && score <= 83) {
				System.out.println(score + "점은 B- 입니다.");
			}
		} else if (score >= 70 && score <= 79) {
			if (score >= 77) {
				System.out.println(score + "점은 C+ 입니다.");
			} else if (score >= 74 && score <= 76) {
				System.out.println(score + "점은 C0 입니다.");
			} else if (score >= 70 && score <= 73) {
				System.out.println(score + "점은 C- 입니다.");
			}
		} else if (score >= 60 && score <= 69) {
			if (score >= 67) {
				System.out.println(score + "점은 D+ 입니다.");
			} else if (score >= 64 && score <= 66) {
				System.out.println(score + "점은 D0 입니다.");
			} else if (score >= 60 && score <= 63) {
				System.out.println(score + "점은 D- 입니다.");
			}
		} else {
			System.out.println(score + "점은 F 입니다.");
		}
		
	}

}
