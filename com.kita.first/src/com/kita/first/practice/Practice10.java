package com.kita.first.practice;

import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력 해 주세요 : (0~100)");
		int score = sc.nextInt();
		
		if(score > 100 || score < 0) {
			System.out.println("잘못 입력 하셨습니다.");
			return;
		}
		
		String opt = "";
		int mod = score % 10; // 1의 자리수 알기
		if (mod >=7 ) {
			opt = "+";
		} else if (mod <= 3) {
			opt = "-";
		}
		
		switch (score / 10) {
		case 10:
			System.out.println("A+");
			break;
		case 9:
			System.out.println("A" + opt);
			break;
		case 8:
			System.out.println("B" + opt);
			break;
		case 7:
			System.out.println("C" + opt);
			break;
			default:
			System.out.println("D");
		}
		sc.close();
	}
}
