package com.kita.first.operator;

public class Operator6 {
	public static void main (String args[]) {
		int n1 = 5;
		int n2 = 5;
		int n3 = 6;
		
		boolean result1 = (n1 == n2 && n1 == n3 && n2 == n3);
		System.out.println(result1);
		boolean result2 = (n1 == n2 || n1 == n3 || n2 == n3);
		System.out.println(result2);
	}
}
