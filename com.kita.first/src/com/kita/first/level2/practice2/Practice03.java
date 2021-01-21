package com.kita.first.level2.practice2;

public class Practice03 {
	private String name;
	private int age;
	
	Practice03(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public static void main(String[] args) {
		Practice03 myP = new Practice03("김",20);
		myP.setName("김냥냥");
		int myInfo = myP.getAge();
		String myName = myP.getName();
		System.out.printf("내 이름은 %s\n나이는 %d",myName,myInfo);
		// 이름 , 나이 출력 printf
	}
}
