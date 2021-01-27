package com.kita.first.level3.vendingmachine;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		자판기게임
//		메뉴: 콜라, 사이다, 캔커피, 데자와, 환타, 웰치스
//		가격: 900, 700, 400, 500, 600, 1000
//
//		--메뉴--
//		1. 콜라 900원
//		2. 사이다 700원
//		.
//		.
//		.
//		6. 웰치스 1000원
		
//		메뉴를 입력하세요(0 입력 시 종료): 1
//		콜라 900원
//		메뉴를 입력하세요(0 입력 시 종료): 3
//		캔커피 400원
//		.
//		.
//		.
//		메뉴를 입력하세요(0 입력 시 종료): 0
//		합계: 3700원
		int len = 6;
		Menu menu = new Menu(len);
//		Menu menu2 = new Menu(8); // 방이 8개인 menu2
		PrintV print = new PrintV();
		Scanner sc = new Scanner(System.in);
		// 메뉴 배열에 메뉴이름 집어 넣기
		menu.inputArrItems();
		// 가격 배열에 가격 집어 넣기
		menu.inputArrPrices();
		// 메뉴 배열에 메뉴 이름 집어 넣기 for문
//		for(int i=0; i<len; i++) {
//			System.out.println("메뉴 이름을 입력해 주세요.");
//			menu.setMenuItem(i, sc.next()); // item에 메뉴 이름이 들어가야한다.
//		}
		
		System.out.println("--메뉴--");
		for(int i=1; i<=len; i++) {
			print.printMenu(menu, i);
		}
		// 29라인 뒤에 해야 할 일 . 메뉴, 가격 배열에 값 입력
		
		// 메뉴, 가격 배열에 값 입력
		Game game = new Game();
		int myNum;
		
		while(true) {
			myNum = game.inputNum();
			
			if(myNum<1 || myNum>len) {
				System.out.println("범위 내의 숫자를 입력하세요.");
				continue;
			} else if(myNum == 0) {
				break;
			}
			game.setCount();
			game.sumMenuPrice(menu,myNum);
			print.printMenu(menu,myNum);
		}
		game.setCount();
		game.sumMenuPrice(menu, myNum);
		print.printMenu(menu, myNum);
		
		print.printTotalPrice(game);
		
		Scanner scan = new Scanner(System.in);
		String[] menuArr = {"콜라", "사이다", "캔커피", "데자와", "환타", "웰치스"};
		int[] priceArr = {900, 700, 400, 500, 600, 1000};
		int num;
		int total = 0;
		
		// 1) 메뉴판 찍기 기능
		System.out.println("--메뉴--");
		for(int i=0; i<menuArr.length; i++) {
			System.out.printf("%d. %s %d원\n", i+1, menuArr[i], priceArr[i]);
		}
		
		// 2) 0 입력 받을 때 까지 반복문 기능
		while(true) {
			
			// 2-1) 번호 입력 받는 기능
			System.out.print("메뉴를 입력하세요(0 입력 시 종료): ");
			num = scan.nextInt();
			
			// 2-2) 입력 받은 번호 예외처리 기능 / 분기 가르기 기능
			if(num<0 || num>6) {
				System.out.println("범위 내의 숫자를 입력하세요.");
				continue;
			} else if(num == 0) {
				break;
			}
			// 3) 합계 합산 기능
			
			total += priceArr[num-1];
			
			// 4) 입력 받은 번호의 음료 내용 출력 기능
			System.out.printf("%s %d원\n", menuArr[num-1], priceArr[num-1]);
			
		}
		scan.close();
		// 5) 합계 찍어주는 기능
		System.out.printf("합계: %d원\n", total);
	}
}
