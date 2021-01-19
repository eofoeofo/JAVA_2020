package com.kita.first.level2.pack1;
import com.kita.first.level2.pack2.*;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 6;
		int n3 = 8;
		FinalStatic fs1 = new FinalStatic(n1);
		FinalStatic fs2 = new FinalStatic(n2);
		FinalStatic fs3 = new FinalStatic(n3);
		
		System.out.println(fs1.N1); // 상수(final)로 선언했는데 값이 바뀐다. (원래 바뀌면 안됨) 
		System.out.println(fs2.N1); // 그래서 final은 상수라고 하기 힘들다
		System.out.println(fs3.N1);
		System.out.println();
		System.out.println(fs1.N2); // 진짜 상수 처리를 하려면 static final을 사용해야 한다.
		System.out.println(fs2.N2); // static final int N2 = 3 | 꼭 초기값 설정을 해줘야한다.
		System.out.println(fs3.N2);
		System.out.println();
		System.out.println();
		
		FinalStatic.printNum(1);
//		java.util.Scanner sc = new Scanner(System.in);
//		스캐너타입 Scanner 변수 sc = new Scanner(매개변수System.in);
		
		Class1 c1 = new Class1(10);
//		Class1 c2 = new Class1();
		com.kita.first.level2.pack2.Class1 c2 = new com.kita.first.level2.pack2.Class1();
		
		
		
	}
}
