package com.kita.first.level2.pack1;

// 전체 프로그램중 하나의 인스턴스만 사용
// 단 하나의 객체만 생성하게 하는것
public class Singleton {
	private static Singleton sg = null;
	
	private Singleton() {
	}
	// 객체 생성은 프라이빗으로(막아놓음)
	// 메소드는 public
	public static Singleton getInstance() { // 반드시 static을 붙여야함 (객체없이 접근가능)
		if (sg == null) {
			sg = new Singleton();
		}
		return sg;
	}
}
