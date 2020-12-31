package com.kita.first;

public class Switch {
	public static void main(String[] args) {
		int rNum = (int)(Math.random()* 6) + 1;
		String menu;
		switch(rNum) {
		case 1:
			menu = "한식";
			break;
		case 2:
			menu = "중식";
			break;
		case 3: case 4:
			menu = "한식";
			break;
		case 5:
			menu = "일식";
			break;
		default:
			menu = "치킨";
			break;
		}
		System.out.printf("오늘의 메뉴는 %s 입니다 ",menu);
	}

}
