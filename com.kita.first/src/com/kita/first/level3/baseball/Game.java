package com.kita.first.level3.baseball;

import java.util.Scanner;

public class Game {
// 실제 게임 실행하는 실행 클래스
	public static void main(String[] args) {
		final int LEN = 3;
		Baseball ball = new Baseball(LEN); // 매개변수로 전달해야지 3을 인식함(Baseball이)
		MyBall myball = new MyBall(LEN);
		
		do {
			myball.setNumbers();
		} while(Checker.check(LEN,ball,myball)); // new 없이 바로 받아왔기에 check에 static을 사용
	}
}
