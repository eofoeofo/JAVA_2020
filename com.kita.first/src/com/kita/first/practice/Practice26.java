package com.kita.first.practice;

public class Practice26 {
	//1~9 <- 랜덤으로 겹치지 않게 배열에 초기화 시키기
	public static void main(String[] args) {
		int[] ArrNum = new int[9];
		
		for(int i=0; i<ArrNum.length; i++) {
			ArrNum[i] = (int)(Math.random() * 9)+1;
			for(int j=0; j<i; j++) {
				if(ArrNum[i] == ArrNum[j]){
					i--;
				}
			}
		}
		for(int z=0; z<ArrNum.length; z++) {
			System.out.println(ArrNum[z]);
		}
	}
}
