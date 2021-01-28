package com.kita.first.level3.baseball;

import java.util.Scanner;

public class MyBall {
// 내가 숫자 값 입력하고 예외 처리하는 클래스
	// 필드
	private int[] myArr;
	private Scanner sc;
	
	// 생성자
	public MyBall(int LEN) { // 게임 카운트 만큼 배열을 만들어야하니 
		init(LEN);
	}
	
	// 메소드
	private void init(int LEN) {
		myArr = new int[LEN];
		sc = new Scanner(System.in);
	}
	
	setNumbet() {
		
	}
	
	getMyNum(int index) {
		
	}
	
	public void setNumbers(int LEN) {
		for(int i=0; i<rArr.length; i++) { // 랜덤 중복 제거
			rArr[i] = (int)(Math.random() * 9)+1;
			for(int j=0; j<i; j++) {
				if(rArr[i] == rArr[j]){
					i--; 
					break;
				}
			}
		}
		for(int i=0; i<LEN; i++) {
			System.out.println(rArr[i]);
		}
	}
	
	void ErrorMessage(int LEN) {
		while(true) { // 오류 입력 경고메세지 출력
			int strike=0;
			int ball=0;
			for(int i=0; i<LEN; i++) {
				System.out.printf("값%d :\n ",i+1);
				myArr[i] = sc.nextInt();
				if(myArr[i]<=0 || 9<myArr[i] ) {
					System.out.println("범위 밖 숫자를 입력 하셨습니다.");
					i--;
					continue;
				}
				for(int j=0; j<i; j++) {
					if(myArr[j] == myArr[i]) {
						System.out.println("중복된 숫자를 입력 하셨습니다.");
						i--;
						continue;
					}
				}
			}
			
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

}
