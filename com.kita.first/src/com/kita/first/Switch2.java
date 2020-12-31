package com.kita.first;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sNum = sc.next();
		String menu;
		
		switch(sNum) {
		case "일":
		menu = "한식";
		break;
		
		case "이":
		menu = "중식";
		break;
		
		case "삼": case "사":
		menu = "한식";
		break;
		
		case "오":
		menu = "일식";
		break;
		
		default:
		menu = "치킨";
		break;
		}
		System.out.printf("오늘의 메뉴는 %s 입니다 ",menu);
		sc.close();
	}
}
