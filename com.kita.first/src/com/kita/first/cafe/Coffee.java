package com.kita.first.cafe;

public class Coffee {
	private String name;
	private int price;
	
	public Coffee(MenuItem mi) { // 메뉴판의 있는 메뉴를 가지고 커피를 만들기 위해서 매개변수를 받았다.
		name = mi.getName(); // mi에 있는(메뉴판에 있는) 메뉴를 name에 넣겠다.
		price = mi.getPrice(); // mi에 있는(메뉴판에 있는) 가격을 price에 넣겠다.
	}

	public String getName() {
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
	
}
