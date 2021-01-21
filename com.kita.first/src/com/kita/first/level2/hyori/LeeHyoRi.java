package com.kita.first.level2.hyori;

public class LeeHyoRi {
	// 필드
	public String music;
	protected String sns;
	private int star;
	
	// 생성자
	public LeeHyoRi() {
	}
	
	LeeHyoRi(String sns) {
		this.sns = sns;
	}
	
	private LeeHyoRi(int star) {
		this.star = star;
	}
	
	// 메소드
	public static void main(String[] args) {
		LeeHyoRi hr = new LeeHyoRi(); // 생성자의 기본메소드
		hr.music = "유고걸"; // 자신의 클래스 내부에서 접근이 가능하다 (public)
		hr.sns = "인스타"; // 자신의 클래스 내부에서 접근이 가능하다 패키지가 다르면 접근 불가(default)
		hr.star = 1000000; // 자신의 클래스 내부에서만 접근이 가능하다 (private)
		// protected는 다른 패키지일 경우, 
		
		LeeHyoRi hr2 = new LeeHyoRi("인스타");
		LeeHyoRi hr3 = new LeeHyoRi(1000000);
		
		hr.sing();
		hr.drinkTea();
		hr.dance();
	}
	
	public void sing() {
	}
	protected void drinkTea() {
	}
	private void dance() {
		
	}
	
	// 
}
