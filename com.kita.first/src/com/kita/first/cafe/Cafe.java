package com.kita.first.cafe;

public class Cafe {
	public static void main(String[] args) {
		Menu menu = new Menu(); // 메뉴판이 필요하니 메뉴
		Customer cus = new Customer(); // 
		Barista bar = new Barista(); // 커피 타줄 사람이 필요하니
		
		MenuItem chosenMenu = cus.order(menu);// 고객이 메뉴판을 보고 주문을 한다.
		Coffee c1 = bar.makeCoffee(chosenMenu); // 메뉴아이템 타입의 매개변수를 넘겨주면 바리스타가 커피타입의 무언가를 만들어준다
		cus.drinkCoffee(c1); // 고객이 커피를 마시면 끝
	}
}
