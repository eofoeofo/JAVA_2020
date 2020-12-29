package com.kita.first;

public class If {
	public static void main(String args[]) {
		int n1 = 3;
		int n2 = 2;
		boolean isOdd = (n1 % 2 == 1) ? true : false; // n1과 2를 나눈 나머지가 1인가?
		
		String oddNum;
		
		if(n1 % 2 == 1) 
		{
			oddNum = "홀수";
		} 
		else 
		{
			oddNum = "짝수";
		}
		System.out.printf("%d은(는) %s입니다", n1 , oddNum);
	}
}
