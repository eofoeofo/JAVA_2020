package com.kita.first.level3.vendingmachine;

public class PrintV {
	public void printMenus(int len) { // 메뉴판 찍기는 메뉴판만 보여주고 끝나기에 리턴 값이 필요 없는 void 타입
		System.out.println("--메뉴--");
		for(int i=0; i<len; i++) {
//			System.out.printf("%d. %s %d원\n", i+1, menuArr[len], priceArr[len]);
		}
	}
}
