package com.kita.first.level3.baseball;

import java.util.Scanner;

public class Baseball {
// 컴퓨터가 랜덤으로 숫자 뽑는 클래스
	Scanner sc = new Scanner(System.in);
	private int[] rArr; // 컴퓨터가 뽑는 랜덤 3개
	int[] myArr;

	
	public Baseball(int LEN) { // 감춰두는 메소드(init)
		init(LEN);
	}
	private void init(int LEN) {
		rArr = new int[LEN];
		setRandom();
	}
	
	public Baseball() {
	}

	public void setrArr(int index, int randN) {
		rArr[index] = randN;
	}
	public void setmyArr(int index, int myN) {
		myArr[index] = myN;
	}
	public int getrArr(int index) { // 배열의 통째로가 아닌 인덱스0번,1번 하나 씩 가져오는것
		return rArr[index];
	}
	public int getmyArr(int index) {
		return myArr[index];
	}
	
	private void setRandom() { // 랜덤 중복 제거
		int max = 9; // 변수는 중괄호를 닫으면 사라진다, 가져가고 싶으면 필드,게터세터로 받아야한다
		int min = 1;
		for(int i=0; i<rArr.length; i++) {
			rArr[i] = (int)(Math.random() * (max - min + 1))+min;
			for(int j=0; j<i; j++) {
				if(rArr[i] == rArr[j]) {
					i--;
					break;
				}
			}
		}
	}
}
