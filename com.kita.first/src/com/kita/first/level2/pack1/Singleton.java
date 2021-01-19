package com.kita.first.level2.pack1;

// 전체 프로그램중 하나의 인스턴스만 사용
public class Singleton {
	private static Singleton sg = null;
	
	private Singleton() {
	}
	
	public static Singleton getInstance() { // 반드시 static을 붙여야함
		if (sg == null) {
			sg = new Singleton();
		}
		return sg;
	}
}
