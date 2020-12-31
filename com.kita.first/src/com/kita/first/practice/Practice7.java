package com.kita.first.practice;

public class Practice7 {
	public static void main(String[] args) {
		// 1~6 총 6 개의 메뉴 랜덤 뽑기
		int rNum = (int)(Math.random()* 6) + 1;
		System.out.print("오늘의 메뉴는 : ");
		if(rNum == 1) {
			System.out.println("피자");
		} else if(rNum == 2) {
			System.out.println("돈까스");
		} else if(rNum == 3) {
			System.out.println("회");
		} else if(rNum == 4) {
			System.out.println("집밥");
		} else if(rNum == 5) {
			System.out.println("닭");
		} else {
			System.out.println("햄버거");
		}
	}
}
