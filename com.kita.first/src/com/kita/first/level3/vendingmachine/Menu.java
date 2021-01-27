package com.kita.first.level3.vendingmachine;

import java.util.Scanner;

import com.kita.first.level3.ScanNum;
import com.kita.first.level3.Utils;

public class Menu {
	// 필드
	private String[] menuArr;
	private int[] priceArr;
	Scanner sc = new Scanner(System.in);
	
	// 생성자
	public Menu(int len) {
		menuArr = new String[len];
		priceArr = new int[len];
	}
	
	// 메소드
	// 메뉴 배열에 메뉴이름 집어넣기
	public void setMenuItem(int index, String item) { // 첫번쨰는 어디에 넣을지, 두번째는 무엇을 넣을지
		menuArr[index] = item;
	}
	// 가격 배열에 메뉴이름 집어넣기
	public void setMenuPrice(int index, int price) { // 첫번쨰는 어디에 넣을지, 두번째는 무엇을 넣을지
		priceArr[index] = price;
	}
	// 메뉴배열의 index번 째 문자열 값 리턴
	public String getMenuItem(int index) {
		return menuArr[index];
	}
	// 가격배열의 index번 째 정수 값 리턴
	public int getMenuPrice(int index) {
		return priceArr[index];
	}
	// 메뉴 배열에 순차적으로 값 입력
	void inputArrItems() { // 메뉴 arr에 값을 집어 넣기에 매개변수 필요없다. menuArr에 바로 값을 집어 넣으면 된다.
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<menuArr.length; i++) {
			System.out.printf("%d번째 값 입력 : ", i+1);
			String str = sc.next();
			menuArr[i] = str; 
		}
		sc.close();
	}
	// 가격 배열에 순차적으로 값 입력
	void inputArrPrices() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<priceArr.length; i++) {
			System.out.printf("%d번째 값 입력 : ", i+1);
			ScanNum sn = new ScanNum();
			String str = sn.inputNumString();
			int num = Utils.parseStrToInt(str); // sc.nextInt(); // 내가 받은 값을 int로 받아서 result에 넣어줘라
			if (num == 0) {
				System.out.println("잘못 입력 하셨습니다. 다시 입력 해주세요.");
				i--;
				continue;
			}
			priceArr[i] = num; 
		}
		sc.close();
	}
}
