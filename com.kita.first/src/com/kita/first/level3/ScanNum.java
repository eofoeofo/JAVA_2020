package com.kita.first.level3;

import java.util.Scanner;

public class ScanNum {
	public String inputNumString() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자만 입력 하세요 : ");
		String str = sc.next();
		sc.close();
		return str;
	}
	public void printMsg(int num) { // 정수형의 어떠한 숫자값을 받을 매개변수가 필요
		if (num == 0) { // 0이라는건 문자열이 섞여서 에러가 터졌다는 뜻
			System.out.println("잘못 입력 했습니다.");
		} else {
			System.out.println("입력한 숫자 : " + num);
		}
	}
}
