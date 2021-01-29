package com.kita.first.level4;

import java.util.Scanner;

public class ThrowsException {
	Scanner sc = new Scanner(System.in);
	
	 public void method1() throws Exception {  
		int num = Integer.parseInt(sc.next());
		try {
			
		} catch(NullPointerException e) { // 참조변수안에 Null값이 있을 때 처리
			
		} catch(Exception e) { // 항상 Exception는 맨 마지막에 들어간다. 
			// Exception는 다른 모든 예외는 처리하겠다는 뜻
			
		} finally {
			
		}
	}
}
