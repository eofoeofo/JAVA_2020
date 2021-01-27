package com.kita.first.level3.vendingmachine;

public class PrintV {
	// 메뉴판 찍기는 메뉴판만 보여주고 끝나기에 리턴 값이 필요 없는 void 타입
	// 메뉴 이름과 가격 찍기
	void printMenu(Menu menu, int n) { // 메뉴판을 찍으려면 메뉴판이 필요하니 매개변수로 Menu가 필요
		// 버튼을 담당하는 n. n은 1부터 시작하기에 배열에는 n-1으로 값을 정해준다(index는 0부터 시작하니까.) 
		String item = menu.getMenuItem(n-1); // menu.menuArr는 private이기에 get으로 받아와야한다
		int price = menu.getMenuPrice(n-1); // menu.priceArr는 private이기에 get이 필요하다
		System.out.printf("%d. %s %d원\n", n, item, price);
	}
	
	void printTotalPrice(Game game) {
		System.out.printf("합계 : %d원\n", game.getTotalPrice());
	}
}
