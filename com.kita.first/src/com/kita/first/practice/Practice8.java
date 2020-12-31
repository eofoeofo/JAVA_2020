package com.kita.first.practice;

import java.util.Scanner;

public class Practice8 {
	public static void main(String[] args) {
		// 몇 월인지 입력해 주세요. (1~12월)
		// 3~5월 : 봄
		// 6~8월 : 여름
		// 9~11월 : 가을
		// 12~2월 : 겨울
		// n월은 00 입니다.
		Scanner sc = new Scanner(System.in);
		System.out.printf("몇 월 인지 입력해 주세요.(1~12월)");
		int month = sc.nextInt();
		String msg;
		
		switch(month) {
		case 3: case 4: case 5:
		msg = "봄";
		break;
		
		case 6: case 7: case 8:
		msg = "여름";
		break;
		
		case 9: case 10: case 11:
		msg = "가울";
		break;
		
		default:
		msg = "겨울";
		break;
		}
		System.out.printf("%d월은 %s입니다",month,msg);
		sc.close();
	}
}
