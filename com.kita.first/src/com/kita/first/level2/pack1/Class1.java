package com.kita.first.level2.pack1;

public class Class1 {
	int n1;
	
	Class1(int n1) { // private은 내부 클래스에서만 사용가능
		this.n1 = n1;
	}
	
	void print(int input) {
		System.out.println(input);
	}
}
