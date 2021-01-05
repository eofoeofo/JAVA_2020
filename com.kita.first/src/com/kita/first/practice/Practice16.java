package com.kita.first.practice;

import java.util.Scanner;

public class Practice16 {
	public static void main(String[] args) {
// 1~6 총 6 개의 메뉴 랜덤 뽑기를 한번 한 후에
// 뽑힌 메뉴: 00
// 마음에 들면 Y눌러서  반복 끝내고
// "오늘의 메뉴는 00 입니다"
//마음에 안들면 N 눌러서 다시 랜덤 뽑기
//		int rNum = (int)(Math.random()* 6) + 1;
//		System.out.print("오늘의 메뉴는 : ");
//		if(rNum == 1) {
//			System.out.println("피자");
//		} else if(rNum == 2) {
//			System.out.println("돈까스");
//		} else if(rNum == 3) {
//			System.out.println("회");
//		} else if(rNum == 4) {
//			System.out.println("집밥");
//		} else if(rNum == 5) {
//			System.out.println("닭");
//		} else {
//			System.out.println("햄버거");
//		}
		Scanner sc = new Scanner(System.in);
		String menu;
		boolean again = true;
		
		do {
			int rNum = (int)(Math.random()* 6) + 1;
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
			System.out.println("뽑힌 메뉴 : " + menu);
			System.out.print("메뉴가 마음에 드십니까? (Y/N)");
			String result = sc.next();
			if("Y".contentEquals(result)) {
				break;
			}
		} while(again);
		System.out.println("오늘의 메뉴는 %s 입니다." + menu);
	}
}
