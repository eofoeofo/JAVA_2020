package com.kita.first.level3.baseball;

import java.util.Scanner;

public class Game {
// 실제 게임 실행하는 실행 클래스
	public static void main(String[] args) {
		final int LEN = 3;
		Baseball ball = new Baseball(LEN); // 매개변수로 전달해야지 3을 인식함(Baseball이)
		MyBall myball = new MyBall(LEN);
		boolean result = Checker.check(LEN,ball,myball);
		
		do { 
			myball.setNumbers();
		} while(result); // new 없이 바로 받아왔기에 check에 static을 사용
		// 리턴값이 t,f로 나와야한다
		// while이 true일때 s와 게임 카운트가 같지 않다는 뜻
		// while이 true때 한번 더 실행
		System.out.println("END!");
	}
}
