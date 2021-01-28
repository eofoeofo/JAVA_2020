package com.kita.first.level3.vendingmachine;

import java.util.Scanner;

public class Game {
	Scanner sc = new Scanner(System.in); // 번호를 입력 받아야 하기에 scan이 필요 하다
	private int count = 0;
	private int totalPrice = 0;
	
	public int getCount() {
		return count;
	}
	public void setCount() {
		this.count = count++;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	// 번호 입력 받기 
	int inputNum() {
		System.out.println("메뉴를 입력 하세요(0 입력 시 종료) : ");
		return sc.nextInt();
	}
	
	// 메뉴 가격 합산
	void sumMenuPrice(Menu menu, int num) {
		totalPrice += menu.getMenuPrice(num-1);
	}
	
	// 입력 받은 번호의 음료 내용 출력
}
