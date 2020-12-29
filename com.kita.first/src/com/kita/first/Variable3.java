package com.kita.first;

public class Variable3 {
	public static void main(String[] args) {
		int n1 = 10;
		float n2 = 5.5f;
		
		float result1 = n1 + n2;
		int result2 = n1 + (int)n2;
		
		System.out.println(result1);
		System.out.println(result2);
		
		System.out.println(n2);
		
		int n3 = 3;
		int n4 = 4;
		String n5 = "5";
		
//		System.out.println(n3+(n4+n5));
		System.out.println(n3+n4+n5); // int와 string형이 만나서 n3,n4도 자연스럽게 string으로 변함 
		
		System.out.println(1+2+"3"); //33
		System.out.println(1+"2"+3); //123
		System.out.println("1"+2+3); //123
		
	}

}
