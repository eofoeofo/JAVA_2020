package com.kita.first.practice;

public class Practice6 {
	public static void main(String[] args) {
		// 주사위 굴리기 1~6
		int rNum = (int)(Math.random()* 6) + 1; // 0~5 +1
		System.out.println(rNum);
		
		int rNum2 = (int)(Math.random() * 21) + 10; // 0~20
		System.out.println(rNum2);
		
		int rNum3 = (int)(Math.random() * 44) + 14; // 14~57
		System.out.println(rNum3);
		
//		int n = (int)(Math.random() * max-min+1)+min;
	}

}
