package com.kita.first.level3.baseball;

import java.util.Arrays;
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
	
	// 숫자를 입력받는 기능 , 입력을 받기만 하는 것 myArr에 넣어 주기만 하면 됨 리턴 x
	public void setNumbers() { // 내가 입력한 숫자값을 입력을 받는다
		for(int i=0; i<myArr.length; i++) { // 
			System.out.printf("값%d :\n ",i+1);
			String val = sc.next();
			try { // 오류 체크 (여기는 중복 체크가 아니다)
				myArr[i] = Integer.parseInt(val); // 문자열로 받은 값을 변환, 에러가 난다면 문자,숫자가 아닌 한글이나 등등
			} catch(Exception e) {
				i--; // 오류 체크 (여기는 중복 체크가 아니다)
				System.out.println("범위 밖 숫자를 입력 하셨습니다.");
				continue;
			}
			for(int j=0; j<i; j++) {
				if(myArr[j] == myArr[i]) {
					System.out.println("중복된 숫자를 입력 하셨습니다.");
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(myArr)); // 
	}
	
	public int getMyNum(int index) { // 소괄호의 값을 받아서 
		return myArr[index]; // 내가 입력한 값의 인덱스를 리턴해줌
	}
}
