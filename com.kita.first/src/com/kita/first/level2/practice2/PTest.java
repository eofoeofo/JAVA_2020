package com.kita.first.level2.practice2;

public class PTest {
	public static void main(String[] args) {
		Practice03 myP = new Practice03("김",20);
		myP.setName("김냥냥");
		int myAge = myP.getAge();
		String myName = myP.getName();
		System.out.printf("내 이름은 %s\n나이는 %d",myName,myAge);
		// 이름 , 나이 출력 printf
	}
}
