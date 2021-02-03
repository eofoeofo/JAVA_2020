package com.kita.first.cafe;

public class MenuItem { // 메뉴 항목
	private String name; // 메뉴 이름 
	private int price; // 메뉴 가격
	
	public MenuItem(String name,int price) { // 메뉴를 만들 때 메뉴 이름이랑 가격을 바로 정한다(매개변수) 
//		super(); // 자동으로 들어간다
		this.name = name; // 나의 필드로 접근하기 위해 this를 사용
		this.price = price;
	}
	
	public String getName() { // 필드가 private이기에 return으로 값을 던져주는것
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%s\t\t%d,원", name, price); // printf 같은 print는 콘솔창에 출력 , format 은 문자열 타입으로 리턴해주느냐의 차이
	}
}
