package com.kita.first.level4;

public class ThrowsException2 throws Exception {
	void method1() {
		ThrowsException te = new ThrowsException();
		te.parseInputStrToInt();
	    // 직전에 예외처리를 해주지 않으면 빨간줄이 뜬다.
	}
}
