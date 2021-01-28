package com.kita.first.level3.baseball;

import java.util.Scanner;

public class Checker {
	Scanner sc = new Scanner(System.in);
// 스트라이크 , 볼 , 아웃 개수 카운트
	// 번호 입력 받기
	int inputNum() {
		System.out.println("숫자 야구 게임 시작!");
		return sc.nextInt();
	}
	// getter로 받아야한다
	public static boolean check(int LEN, Baseball ball, MyBall myball) { // 배열을 바로 받지는 못하기에 배열이 담겨있는 클래스를 통째로 가져온다
		
	}
	
	// 메뉴 가격 합산
	
	void sumNum(int LEN) {
		
		for(int i=0; i<LEN; i++) { // 랜덤숫자와 사용자 숫자를 비교
			if(myArr[i] == rArr[i]) {
				strike++;
				continue;
			}
			for(int j=0; j<LEN; j++) {
				if(myArr[i] == rArr[j]) {
					ball++;
				}
			}
		}
		System.out.printf("S : %d B : %d O : %d\n",strike,ball,LEN-strike-ball);
		if(strike==LEN) {
			break;
		}
	}
	
}
