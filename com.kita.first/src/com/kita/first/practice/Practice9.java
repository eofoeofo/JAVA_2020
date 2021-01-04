package com.kita.first.practice;

import java.util.Scanner;

public class Practice9 {
	// 2020 - 12 - 31 JAVA 1 숙제
	/*
	 * 점수를 입력해 주세요: (0~100) 90점 이상 A 80점 이상 B 70점 이상 C 나머지는 D입니다. ( +, - 없다)
	 * 
	 * 100 초과면 잘못 입력하였습니다.
	 * 
	 * 일의 자리 수가 7점 이상이면 + 일의 자리 수가 3점 이하이면 -
	 * 
	 * 예를 들어, 95점: A, 97점: A+, 83점: B-
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력 해 주세요 : (0~100)\n90점 이상 A\n80점 이상 B\n70점 이상C\n나머지는 D입니다.");
		int score = sc.nextInt();
		String rating = "잘못 입력 하셨습니다.";
		
		if(score>=97 && 100>=score) {
			rating = "A+";
		} else if(score>=94 && 96>=score) {
			rating = "A";
		} else if(score>=90 && 93>=score) {
			rating = "A-";
		} else if(score>=87 && 89>=score) {
			rating = "B+";
		} else if(score>=84 && 86>=score) {
			rating = "B";
		} else if(score>=80 && 83>=score) {
			rating = "B-";
		} else if(score>=77 && 79>=score) {
			rating = "C+";
		} else if(score>=74 && 76>=score) {
			rating = "C";
		} else if(score>=70 && 73>=score) {
			rating = "C-";
		} else if (score>=0 && 69>=score) {
			rating = "D";
		} /*
			 * else { System.out.println("잘못 입력 하셨습니다."); }
			 */
		System.out.print(rating);
		sc.close();
	}
}
