package com.kita.first.practice;

public class Practice3 {
	public static void main(String agrs[]) {
		// n1 () n2
		int n1 = 10;
		int n2 = 3;
		
		int result1 = n1 += n2;
		System.out.printf("n1 + n2 = %d \n",result1);
		n1 = 10;
		
		int result2 = n1 -= n2;
		System.out.printf("n1 - n2 = %d \n",result2);
		n1 = 10;
		
		int result3 = n1 *= n2;
		System.out.printf("n1 * n2 = %d \n",result3);
		n1 = 10;
		
		double result4 = (double)n1 / n2;
		System.out.printf("n1 / n2 = %.3f \n",result4);
		n1 = 10;
		
		int result5 = n1 %= n2;
		System.out.printf("n1 %% n2 = %d \n",result5);
		
	}

}
