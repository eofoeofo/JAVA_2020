package com.kita.first.level3.practice;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자만 입력 하세요 : ");
		String result = sc.next(); // 일단 문자열로 다 받는다 (정수,문자 섞여서 입력 되었을 수 도 있으니)
		int n1;
		
		try {
			n1 = Integer.parseInt(result);
			System.out.println("입력하신 값은 : " +result);
			// 문자열 정수로 변환 시도
		} catch(Exception e) {
			// 변환 실패 출력 단
			e.printStackTrace();
			System.out.println("변환 실패");
		}
		System.out.println("끝");
	}
}
