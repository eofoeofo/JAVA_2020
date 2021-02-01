package com.kita.first.level4;

import java.util.Scanner;

public class ThrowsException {
	Scanner sc = new Scanner(System.in);
	
	 public void method1() { //throws Exception   
		System.out.println("숫자를 입력해 주세요 : ");
		String str = sc.next();  // 2가지 방법
		int num = 0;
		try {
			num = Integer.parseInt(str);
		} catch(Exception e) {
			System.out.println("잘못 입력 했습니다.");
		}
		
//		public void method1() throws Exception {  
//			int num = Integer.parseInt(sc.next());
		try {
			// catch문 안에 존재 확률이 높은 예외부터 먼저 처리 한다.
		} catch(NumberFormatException e) { // 숫자값만 받아야하는데, 문자가 존재할 떄
			System.out.println("문자가 존재합니다. 다시 입력 하세요.");
		}
		catch(NullPointerException e) { // 참조변수안에 Null값이 있을 때 처리
			System.out.println("주소값이 연결되어 있지 않습니다.");
		} catch(Exception e) {
			System.out.println("잘못 입력 했습니다.");// 항상 Exception는 맨 마지막에 들어간다. 
			// Exception는 다른 모든 예외는 처리하겠다는 뜻
			// if문의 else같은 존재다
			
		} finally {
			
		}
	}

	public void parseInputStrToInt() {
		// TODO Auto-generated method stub
		
	}
}
