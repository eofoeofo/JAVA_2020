package com.kita.first.practice;

import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수학 응시 유형을 입력해 주세요 : ");
		System.out.println("점수를 입력해 주세요 : ");
		String math = sc.next();
		int score = sc.nextInt();
		
		String msg = "잘못 입력 하셨습니다.";
		
			if("가".equals(math)) {
				if(score>60) {
					msg = "평균 초과 입니다.";
				}
				else if(score<60) {
					msg = "평균 미만 입니다.";
				}
				else {
					msg = "평균 입니다.";
				}
			} else if("나".equals(math)) {
				if(score>70) {
					msg = "평균 초과 입니다.";
				}
				else if(score<70) {
					msg = "평균 미만 입니다.";
				}
				else {
					msg = "평균 입니다.";
				}
			}
		System.out.println(msg);
		sc.close();
	}
}
