package com.kita.first.cafe;

import java.util.List;
import java.util.ArrayList;

public class Menu {
	private List<MenuItem> arr = new ArrayList<MenuItem>();
	
	public Menu() { // 기본 메뉴로 넣고싶은 메뉴 넣으면 된다.
		arr.add(new MenuItem("아메리카노", 2000));
		arr.add(new MenuItem("카페 라떼", 3000));
		arr.add(new MenuItem("바닐라 라떼", 3000));
		arr.add(new MenuItem("생과일 주스", 4000));
	}
	
	public void menuSetter(MenuItem mi) {
		arr.add(mi); // 배열의 맨 뒷자리에 넣는것, 무언가 추가할 메뉴가 생긴다면 있어야할 기능
	}
	
	public void showMenus() {
		System.out.println(" MENU ");
		for (int i=0; i<arr.size(); i++) {
			MenuItem m = arr.get(i); // 내 메뉴에 있는 메뉴를 하나 씩 받아서 찍고 , 반복하는 기능
			System.out.printf("%d. %s\t\t%,d원\n", i+1, m.getName(), m.getPrice());
		}
		return;
	}
	
	public MenuItem choose(int idx) { // getter
		return arr.get(idx); // 내가 선택한 메뉴 안의 메뉴를 return 하겠다.  //  .get (안에 든 값을 return)
	}
}
