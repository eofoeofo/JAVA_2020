package com.kita.first.practice;

import java.util.Scanner;

public class Practice25 {
	//자판기게임
	//메뉴: 콜라, 사이다, 캔커피, 데자와, 환타, 웰치스
	//가격: 900, 700,  400,   500,  600, 1000
	// 메뉴를 입력하세요 (0입력 시 종료) : 1
	// 콜라 : 900원
	// 메뉴를 입력하세요 (0입력 시 종료) : 2
	// 사이다 : 700원
	// 메뉴를 입력하세요 (0입력 시 종료) : 0
	// 합계 : 1600원
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] menuArr = {"콜라,사이다,캔커피,데자와,환타,웰치스"};
		int[] priceArr = {900,700,400,500,600,1000};
		int num;
		int total;
		
		for(int i=0; i<menuArr.length-1; i++) {
		for(int j=i+1; j<priceArr.length; j++) {
			System.out.println("-------메뉴-------");
			num = sc.nextInt();
			System.out.println("-------메뉴-------");
			System.out.println("1. 콜라 900원\n2. 사이다 700원\n3. 캔커피 400원\n4. 데자와 500원\n5. 환타 600원\n7. 웰치스 1000원");
			System.out.printf("메뉴를 입력 하세요 (0 입력 시 종료) : %d", num);
			
			while(num == 0) {
				break;
			}
		}
		}
		}
}
